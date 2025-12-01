package tema4.gramola;

import javax.sound.sampled.LineUnavailableException;

public class NotaTest {
    public static void main(String[] args) throws LineUnavailableException, InterruptedException {
        // Notas musicales (Hz aproximados)
        int DO = 262;   // C4
        int RE = 294;   // D4
        int MI = 330;   // E4
        int FA = 349;   // F4
        int SOL = 392;  // G4
        int LA = 440;   // A4
        int SI = 494;   // B4
        int DO5 = 523;  // C5
        
        // Duración en milisegundos
        int duracionCorta = 200;
        int duracionMedia = 500;
        int duracionLarga = 1000;
        
        System.out.println("Reproduciendo escala musical...");
        
        // Escala ascendente
        Nota.suena(DO, duracionMedia);
        Thread.sleep(100);
        
        Nota.suena(RE, duracionMedia);
        Thread.sleep(100);
        
        Nota.suena(MI, duracionMedia);
        Thread.sleep(100);
        
        Nota.suena(FA, duracionMedia);
        Thread.sleep(100);
        
        Nota.suena(SOL, duracionMedia);
        Thread.sleep(100);
        
        Nota.suena(LA, duracionMedia);
        Thread.sleep(100);
        
        Nota.suena(SI, duracionMedia);
        Thread.sleep(100);
        
        Nota.suena(DO5, duracionLarga);
        Thread.sleep(200);
        
        System.out.println("Reproduciendo con diferentes volúmenes...");
        
        // Con diferentes volúmenes
        Nota.suena(MI, duracionMedia, 0.3); // Bajo
        Thread.sleep(100);
        
        Nota.suena(MI, duracionMedia, 0.7); // Medio
        Thread.sleep(100);
        
        Nota.suena(MI, duracionMedia, 1.0); // Alto
        Thread.sleep(200);
        
        System.out.println("Reproduciendo melodía simple...");
        
        // Melodía simple (primera parte de "Frère Jacques")
        Nota.suena(DO, duracionMedia);
        Thread.sleep(50);
        
        Nota.suena(RE, duracionMedia);
        Thread.sleep(50);
        
        Nota.suena(MI, duracionMedia);
        Thread.sleep(50);
        
        Nota.suena(DO, duracionMedia);
        Thread.sleep(100);
        
        Nota.suena(MI, duracionMedia);
        Thread.sleep(50);
        
        Nota.suena(FA, duracionMedia);
        Thread.sleep(50);
        
        Nota.suena(SOL, duracionLarga);
        Thread.sleep(200);
        
        // Notas más largas con pausas más largas
        System.out.println("Reproduciendo notas largas...");
        
        Nota.suena(SOL, duracionLarga);
        Thread.sleep(500);
        
        Nota.suena(LA, duracionLarga);
        Thread.sleep(500);
        
        Nota.suena(SI, duracionLarga);
        Thread.sleep(500);
        
        // Secuencia rápida
        System.out.println("Reproduciendo secuencia rápida...");
        
        for (int i = 0; i < 3; i++) {
            Nota.suena(DO5, duracionCorta);
            Thread.sleep(50);
            
            Nota.suena(SI, duracionCorta);
            Thread.sleep(50);
            
            Nota.suena(LA, duracionCorta);
            Thread.sleep(50);
        }
        
        System.out.println("¡Reproducción completada!");
    }
}