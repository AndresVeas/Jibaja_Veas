package JV_ValidarCredenciales;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JVLector {
    private String JVruta = " ";

    public void setJVruta(String jVruta) {
        this.JVruta = "src\\JV_Otan\\JibajaVeas.txt";
    }
    public static Scanner jvsc = new Scanner(System.in);
    
    public String[] JVleerArchivo(String JVruta){
        try {
            File Jvarchivo = new File(JVruta);
            Scanner JVlectura = new Scanner(Jvarchivo);
            for (int i = 0; i<JVLineasArchivo(JVruta);i++){
                if (JVlectura.hasNextLine()) {
                    String JVLinea = JVlectura.nextLine();
                    String[] JVcredenciales = JVLinea.split("\\."); 
                    return JVcredenciales;
                } else {
                    return new String[0];
                }
        
            }
            JVlectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
            return new String[0];
        }
        return new String[0];
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
            return JVlineas;
        } catch (FileNotFoundException e) {
            return -1;
        }
    }

    public void JVImprimirCoordenada (String [] JVcoordenadas, int JVposicion) {
        System.out.println(JVcoordenadas[JVposicion]);
    }
}
