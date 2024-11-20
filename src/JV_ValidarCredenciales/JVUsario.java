package JV_ValidarCredenciales;

public class JVUsario {
    private String jvUsuario;
    private String jvClave;
    private String [] jvListadoUsarios = {"Veas", "Jibaja", "Paccha"};

    public JVUsario (){
        setJvUsuario("");
        setJvClave("1234");
    }

    public JVUsario(String jvUsuario, String jvClave) {
        setJvUsuario(jvUsuario);
        setJvClave(jvClave);
    }
    
    public String getJvUsuario() {
        return jvUsuario;
    }

    public void setJvUsuario(String jvUsuario) {
        if (jvUsuario == null || jvUsuario.isEmpty()) jvUsuario = "SuApellido";
        this.jvUsuario = jvUsuario.toLowerCase();
    }

    public void setJvClave(String jvClave) {
        if (jvClave == null || jvClave.isEmpty()) jvClave = " ";
        this.jvClave = jvClave;
    }

    
    public boolean jvValidarCredenciales ( ){
        String jvUsuario = " ";
        String jvClave = " ";
        int jvIntentos = 0;

        System.out.println("Bienvenido, ingresa tus credenciales.");
        do {
            System.out.print("Usuario: ");
            jvUsuario = JVLector.jvsc.nextLine().trim();
            int i = JvBucarNumeroUsario (jvUsuario);
            System.out.print("Cotraseña: ");
            jvClave = JVLector.jvsc.nextLine().trim();

            if (i!=-1){
                if (this.jvListadoUsarios[i].equalsIgnoreCase(jvUsuario) && this.jvClave.equalsIgnoreCase(jvClave))
                return true;
            }
            System.out.println("El usuario o la contraseña no son correctos...");
            jvIntentos++;
        } while (jvIntentos <3);
        return false;
    }

    private int JvBucarNumeroUsario (String jvUsuario){
        for (int i=0; i<jvListadoUsarios.length; i++){
            if (jvUsuario.equals(jvListadoUsarios[i])){
                return i;
            }
        }
        return -1;
    }
}