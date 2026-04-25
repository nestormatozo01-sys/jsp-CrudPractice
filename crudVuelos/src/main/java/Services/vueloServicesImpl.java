package Services;

import Models.vuelosModel;

import java.util.ArrayList;
import java.util.List;

public class vueloServicesImpl implements vuelosServices {
    private static final List<vuelosModel> vuelos = new ArrayList<>();
    @Override
    public void agregarVuelos(vuelosModel vuelo) throws   Exception {
        for (vuelosModel v : vuelos){
            if (v.getNumeroVuelo().equals(vuelo.getNumeroVuelo())){
                throw new Exception("El vuelo ya existe");
            }
            
        }
        vuelos.add(vuelo);
    }

    @Override
    public String validarVuelos(vuelosModel vuelos){
        return "Hecho";
    }

    @Override
    public void actualizarVuelo(vuelosModel vueloActualizado) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).getNumeroVuelo().equals(vueloActualizado.getNumeroVuelo())) {
                vuelos.set(i, vueloActualizado);
                break;
            }
        }
    }

    @Override
    public vuelosModel buscarVuelo(String numeroVuelo) {
        return vuelos.stream()
                .filter(v -> v.getNumeroVuelo().equals(numeroVuelo))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void eliminarVuelo(String numeroVuelo) {
        vuelos.removeIf(v -> v.getNumeroVuelo().equals(numeroVuelo));
    }

    @Override
    public List<vuelosModel> listarVuelos() {
        return vuelos;
    }

  
}
