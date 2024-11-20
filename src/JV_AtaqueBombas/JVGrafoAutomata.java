package JV_AtaqueBombas;


public class JVGrafoAutomata {
    private int e=-1;
    private int [] [] matrizTransicion= {
    //   a   b  c  d  t 
        { 0, 1, e, e, e, e},//q0
        { e, 1, 2, e, e, e},//q1
        { e, e, e, 3, e, e},//q2
        { e, e, e, e, 4, e},//q3
        { e, e, e, e, e, 5},//q4
        { e, e, e, e, e, 5},//q5
    };
    private char [] lenguaje = {'a','b','c','d','t'};
    private int estadoActual=0;
    private int columna=0;
    private String datoIngresado="";
    private boolean error=false;
    
    public void JVimprimirAtaque(){
        System.out.println("Ingrese un ataque correspondiente a sus dos ultimos digitos de cedula");
        datoIngresado = JVLector.jvsc.nextLine().trim();
        for (int i=0;i<datoIngresado.length();i++){
            columna=-1;
            for(int j=0;j<lenguaje.length;j++){
                if (datoIngresado.charAt(i)==lenguaje[j]){
                    columna=j;
                    break;
                }
            }
            if (columna !=-1 && estadoActual!=-1) this.estadoActual = matrizTransicion [estadoActual] [columna];
            if (columna==-1) {
                error=true;
                break;
            }
        }
        ImprimirResultados();
        System.out.println();
    }   
    

    private void ImprimirResultados (){
        if (error) {
            System.out.println("\u001B[31mSolo puede ingresar los siguientes caracteres: a,b,c,d,t \u001B[0m");
        } else if (estadoActual==1 || estadoActual==3 || estadoActual==5 ){
            System.out.println("\u001B[32mHaz hecho el ataque: " + datoIngresado +"\u001B[0m");
        } else System.out.println("\u001B[32mEse ataque no está definido para tus dos ultimos digitos de tu cedula\u001B[0m");
    }
}