package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class AutenticacionUtil {
    
    private String clave;

    public boolean iniciarSesion(String clave) {
        return this.clave == clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}