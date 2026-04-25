package Models;

public class vuelosModel {
    private String numeroVuelo;
    private String Aerolinea;
    private String Origen;
    private String Destino;
    private String fechaSalida;
    private String horaSalida;
    private String fechaEntrada;
    private String horaEntrada;
    private String duracionVuelo;


    public vuelosModel(String numeroVuelo, String aerolinea, String origen, String destino, String fechaSalida, String horaSalida, String fechaEntrada, String horaEntrada, String duracionVuelo) {
        this.numeroVuelo = numeroVuelo;
        Aerolinea = aerolinea;
        Origen = origen;
        Destino = destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.duracionVuelo = duracionVuelo;
    }

    public vuelosModel() {
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        Aerolinea = aerolinea;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }



    public String getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(String duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }
    
    
     @Override
    public String toString() {
        return numeroVuelo + " " + Aerolinea + " " + Origen + " " + Destino + " " +
               fechaSalida + " " + horaSalida + " " + fechaEntrada + " " + horaEntrada + " " +
               duracionVuelo;
    }
}
