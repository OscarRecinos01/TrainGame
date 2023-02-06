package homework.code.classes;
import homework.code.JuegoDelTren;
import homework.code.Jugador;
import homework.code.Tren;


public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(
    "Oscar Recinos", 15);
        Tren tren = new Tren();
        JuegoDelTren jugar = new JuegoDelTren(jugador, tren);

        
        jugar.IniciarJuego();

        
    }
}
