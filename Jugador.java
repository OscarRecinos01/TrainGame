package TrainGame;

public class Jugador{
    private Tren tren;
    private String nombre;
    private int tiempoABatir;
    
    
    public Jugador(String nombre, int tiempoABatir) {
        this.nombre = nombre;
        this.tiempoABatir = tiempoABatir;
    }

    public void avanzar(){
        tren.avanzar();

    }
    public void frenar(){
        tren.detenerse();
        
    }
    public void pitar(){
        tren.pitar();
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoABatir() {
        return tiempoABatir;
    }

    public Tren getTren() {
        return tren;
    }
    
    

}
