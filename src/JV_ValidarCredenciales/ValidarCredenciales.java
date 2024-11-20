package JV_ValidarCredenciales;

public class ValidarCredenciales {
    
    public void jvValidarCredenciales ( ){
        String jvusuario = " ";
        String jvclave = " ";
        Boolean jvsinLogeo = true;

        do {
            System.out.println("Bienvenido, ingresa tus credenciales.");
            System.out.print("Usuario: ");
            jvusuario = Lector.sc.nextLine().trim();
            System.out.println("Cotraseña: ");
            jvclave = Lector.sc.nextLine().trim();
        } while (jvsinLogeo);
    }



}
