package TrainGame;

public abstract class Jugador{
    protected Tren tren;
    protected String nombre;
    protected int tiempoABatir;
    

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

    public void setTren(Tren tren) {
        this.tren = tren;
    }
    
}
