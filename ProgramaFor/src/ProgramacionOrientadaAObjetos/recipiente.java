package ProgramacionOrientadaAObjetos;

/**
 * Created by Jesus on 13/11/2016.
 */
public class recipiente {
    boolean statusDelVaso;
    String colorDelRecipiente="negro", tamaño="chico";

    public void llenarRecipiente(){
        System.out.println("El recipiente se ha llenado");
        statusDelVaso=true;

    }

    public void vaciaRecipiente(){
        System.out.println("El recipiente se ha vaciado");
        statusDelVaso=false;
    }

    public void estadoDelRecipiente(){
        if(statusDelVaso){
            System.out.println("El recipiente esta lleno");
        }
        else{
            System.out.println("El recipiente esta vacio");
        }
    }

}
