package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class TestGerente1 {
    public static void main(String[] args) {
    
        Gerente gerente1 = new Gerente(1); // es gerente
        gerente1.setSalario(5000);

        System.out.println("La bonificación para el gerente es de: " + gerente1.bonificacion());

        gerente1.SetClave("1234");
        System.out.println("La clave es: " + gerente1.GetClave());

        boolean result = gerente1.iniciarSesion("1234");
        System.out.println(result);

        gerente1.saludar();
        System.out.println(gerente1.bonificacion());
    }
}