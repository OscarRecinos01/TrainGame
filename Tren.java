package TrainGame;

public class Tren {
    private vagonPrincipal vagonPrincipal;
    private VagonCarga vagonCarga;

    public Tren(){
        this.vagonPrincipal = new vagonPrincipal();
        this.vagonCarga = new VagonCarga();
    }

    public vagonPrincipal getVagonPrincipal() {
        return vagonPrincipal;
    }

    public VagonCarga getVagonCarga() {
        return vagonCarga;
    }

    public void avanzar(){
        System.out.println("El tren esta avanzando ..");
        vagonPrincipal.acelerar();
        System.out.println();
    }

    public void detenerse(){
        System.out.println("El tren esta deteniendose ..");
        vagonPrincipal.frenar();
        System.out.println();
    }

    public void pitar(){
        System.out.println("El tren esta pitando ..");
        vagonPrincipal.tocarClaxon();
        System.out.println();
    }
    
    
}

