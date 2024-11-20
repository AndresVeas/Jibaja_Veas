import JV_AtaqueBombas.*;
public class BombasInteligentes {
    public static void main(String[] args) throws Exception {   
        
        JVUsario obUsuario = new JVUsario();
        if (!obUsuario.jvValidarCredenciales()) {
            System.out.println("Has gastado todos los intentos.");
            System.out.println("Cerrando...");
            System.exit(0);
        }

        JVBarraCarga jvb = new JVBarraCarga();
        JVLector jvLector = new JVLector();
        jvb.setJVruta("src\\JV_AtaqueBombas\\JibajaVeas.txt");
        jvb.jvimprimirBarraCarga(jvLector.JVLineasArchivo(jvb.getJVruta()));

        JVGrafoAutomata grafo = new JVGrafoAutomata();
        grafo.JVimprimirAtaque();
    }
}
