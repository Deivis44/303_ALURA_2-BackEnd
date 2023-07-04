package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public interface Autenticable {

    public void SetClave(String clave);

    public boolean iniciarSesion(String clave);
}