import JV_Otan.JVBarraCarga;
import JV_ValidarCredenciales.JVLector;

public class App {
    public static void main(String[] args) throws Exception {
        JVBarraCarga jvb = new JVBarraCarga();
        JVLector jvLector = new JVLector();
        jvb.setJVruta("src\\JV_Otan\\JibajaVeas.txt");
        jvb.jvimprimirBarraCarga(jvLector.JVLineasArchivo(jvb.getJVruta()));
    }
}
