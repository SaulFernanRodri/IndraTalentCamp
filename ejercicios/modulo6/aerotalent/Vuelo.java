package ejercicios.modulo6.aerotalent;
public class Vuelo {
    private final String numeroVuelo;
    private String origen;
    private String destino;
    private boolean disponible;

    public Vuelo(String numeroVuelo, String origen, String destino){
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.disponible = true;
    }

    public String getNumeroVuelo(){
        return numeroVuelo;
    }

    public String getOrigen(){
        return origen;
    }

    public String getDestino(){
        return destino;
    }

    public boolean isDisponible(){
        return disponible;
    }
    
    public void setOrigen(String origen){
        this.origen = origen;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void reservar(){
        this.disponible = false;
    }
}
