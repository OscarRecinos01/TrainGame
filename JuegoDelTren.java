package homework.code;

import java.util.Scanner;

public class JuegoDelTren {
    private Jugador jugador;
    private Tren tren;
    private Camino camino;

    public JuegoDelTren(Jugador jugador, Tren tren) {
        this.jugador = jugador;
        this.tren = tren;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Tren getTren() {
        return tren;
    }

    public Camino getCamino() {
        return camino;
    }

    public void IniciarJuego() {
        int option = 0;

        do {

            try{
                Scanner in = new Scanner(System.in);
                System.out.println("Que quieres hacer? \n 1. Avanzar \n " +
                        "2. Detenerte \n 3. pitar \n 0. Salir");
                option = in.nextInt();

                switch (option) {
                    case 0:
                        System.out.println("Saliendo del juego.");
                        break;

                    case 1:
                        jugador.avanzar();
                        break;

                    case 2:
                        jugador.frenar();
                        break;

                    case 3:
                        jugador.pitar();
                        break;

                    default:
                        System.out.println("Ingresa un numero valido");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Escribe un valor valido");
                option = -1;

            }

        } while (option != 0);

    }

}
