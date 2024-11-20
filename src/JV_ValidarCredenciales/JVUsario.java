package JV_ValidarCredenciales;

public class JVUsario {
    private String jvusuario;
    private String jvclave;


    public JVUsario (){
        setJvUsuario("");
        setJvClave("1234");
    }

    public JVUsario(String jvusuario, String jvclave) {
        setJvUsuario(jvusuario);
        setJvClave(jvclave);
    }
    
    public String getJvUsuario() {
        return jvusuario;
    }

    public void setJvUsuario(String jvusuario) {
        if (jvusuario == null || jvusuario.isEmpty()) jvusuario = "SuApellido";
        this.jvusuario = jvusuario.toLowerCase();
    }

    public void setJvClave(String jvclave) {
        if (jvclave == null || jvclave.isEmpty()) jvclave = "SuApellido";
        this.jvclave = jvclave;
    }

    
}
