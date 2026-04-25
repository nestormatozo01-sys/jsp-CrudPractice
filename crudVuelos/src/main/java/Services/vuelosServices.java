package Services;

import Models.vuelosModel;

import java.util.List;

public interface vuelosServices {
    void agregarVuelos(vuelosModel vuelos) throws  Exception;
    String validarVuelos(vuelosModel vuelos);
    void actualizarVuelo(vuelosModel vuelos);
    vuelosModel buscarVuelo(String numero);
    void eliminarVuelo(String vuelos);
    List<vuelosModel> listarVuelos();
}
