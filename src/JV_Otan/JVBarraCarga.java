package JV_Otan;

import java.util.Scanner;
import JV_ValidarCredenciales.JVLector;

public class JVBarraCarga {

    private String JVruta = " ";
    Scanner lectura = new Scanner(System.in);

    public String getJVruta() {
        return JVruta;
    }

    public void setJVruta(String jVruta) {
        this.JVruta = jVruta;
    }

    public void jvimprimirBarraCarga(int JVlineasTexto) throws InterruptedException {
        JVLector jvl = new JVLector();
        System.out.println("Loading|Geoposición| Lunes | Martes | Miércoles | Jueves | Viernes | Tipo Arsenal ");
        for (int i=0; i<JVlineasTexto; i++) {
            for(int j=1; j<=100; j++) {
                System.out.print("\r" + j + "%");
                Thread.sleep(25);
            }
            System.out.print("\t");
            jvl.JVImprimirCoordenada(jvl.JVleerArchivo(JVruta), i);
        }
        System.out.println();
    }
}