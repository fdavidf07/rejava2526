package tema4game;

import pio.daw.catalog.game.GameException;
import pio.daw.catalog.game.GameUtil;
import pio.daw.catalog.game.GameUtil.GameOptions;

import java.util.Random;

public class GameTest {
    public static void main(String[] args) {
        try {

            System.out.println("Iniciando Juego");
            for (int i = 1; i <= 10; i++) {
                GameUtil.GameOptions jug1 = dameJugada();
                GameUtil.GameOptions jug2 = GameOptions.paper;
                int iRes = GameUtil.rockPaperScissors(jug1, jug2);
                System.out.println("Jugador 1: " + jug1 + " vs Jugador 2: " + jug2);
                System.out.println("¿Quién ha ganado?: " + iRes);
            }
        }
        catch (GameException gex) {
            gex.printStackTrace();
        }
    } // fin del main

    private static GameOptions dameJugada() throws GameException {

        Random r = new Random();
        int opc = r.nextInt(3); // 0,1,2

        if (opc == 0) {
            return GameOptions.paper;
        } else if (opc == 1) {
            return GameOptions.rock;
        } else { 
            return GameOptions.scissors;
        }
    }
}
