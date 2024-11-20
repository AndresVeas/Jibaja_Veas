package JV_ValidarCredenciales;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JVLector {
    private String JVruta = " ";

    public void setJVruta(String jVruta) {
        this.JVruta = "src\\JV_Otan\\JibajaVeas.txt";
    }
    public static Scanner jvsc = new Scanner(System.in);
    
    public String[] JVleerArchivo(String JVruta){
        try {
            int JVindice = 0;
            String[] JVcoordenadas = new String[JVLineasArchivo(JVruta)];
            File Jvarchivo = new File(JVruta);
            Scanner JVlectura = new Scanner(Jvarchivo);
            while (JVlectura.hasNextLine()) {
                JVcoordenadas[JVindice++] = JVlectura.nextLine( );
            }
            JVlectura.close();
            return JVcoordenadas;
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
            return new String[0];
        }
    }

    public int JVLineasArchivo (String JVruta) {
        try {
            File Jvarchivo = new File(JVruta);
            Scanner JVlectura = new Scanner(Jvarchivo);
            int JVlineas = 0;
            while (JVlectura.hasNextLine()) {
                JVlectura.nextLine();
                JVlineas++;
            }
            JVlectura.close();
            return JVlineas;
        } catch (FileNotFoundException e) {
            return -1;
        }
    }

    public void JVImprimirCoordenada (String [] JVcoordenadas, int JVposicion) {
        System.out.println(JVcoordenadas[JVposicion]);
    }
}