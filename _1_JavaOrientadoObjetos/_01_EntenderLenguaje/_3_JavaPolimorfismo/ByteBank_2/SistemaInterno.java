package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class SistemaInterno {
    
    private String clave = "hola1234";

    public boolean autenticar(Autenticable persona) {
        boolean autentico = persona.iniciarSesion(clave);

        if (autentico) {
            System.out.println("Puede entrar al sistema");
            return true;
        } else {
            System.out.println("No puede entrar al sistema");
            return false;
        }
    }
}