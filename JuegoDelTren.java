package TrainGame;

import java.util.Random;
import java.util.Scanner;

public class JuegoDelTren {
    private Jugador jugador;
    private Tren tren;
    private Camino camino;

    public JuegoDelTren() {
        return;
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

    public void setGame(){
        int modoDeJuego = 0;
        System.out.println("Bienvenido a juego del tren! \n "+
        "¿Quien quieres que maneje el tren? \n 1. Persona \n 2. Maquina");
        Scanner in = new Scanner(System.in);
        modoDeJuego = in.nextInt();
        if(modoDeJuego == 1){
            SetGamePersona(modoDeJuego);

        }else if(modoDeJuego == 2){
            SetGameMaquina(modoDeJuego);
        }
        return;

    }

    public void SetGamePersona(int modoDeJuego){
        jugador = new Persona("Oscar", 30);
        tren = new Tren();
        camino = new Camino();
        jugador.setTren(tren);
        IniciarJuego(modoDeJuego);
        return;
    }

    public void SetGameMaquina(int modoDeJuego){
        jugador = new Maquina();
        tren = new Tren();
        camino = new Camino();
        jugador.setTren(tren);
        IniciarJuego(modoDeJuego);
        return;
    }

    public void IniciarJuego(int modoDeJuego) {
        int option = 0;

        if(modoDeJuego == 1){
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
                    System.out.println("Escribe un valor valido!!");
                    option = -1;

                }

            } while (option != 0);
        }else if(modoDeJuego == 2){
            Random random = new Random();
            int randomOption = 0;
            for (int i = 0; i < 5; i++) {
                randomOption = random.nextInt(1, 3);
                switch (randomOption) {
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
                        break;
                }

            }

        }
    
        return;
    }

}
