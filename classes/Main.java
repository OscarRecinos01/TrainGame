package TrainGame.classes;
import	TrainGame.Jugador;
import	TrainGame.Tren;
import	TrainGame.JuegoDelTren;

public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(
    "Oscar Recinos", 15);
        Tren tren = new Tren();
        JuegoDelTren jugar = new JuegoDelTren(jugador, tren);

        
        jugar.IniciarJuego();

        
    }
}
