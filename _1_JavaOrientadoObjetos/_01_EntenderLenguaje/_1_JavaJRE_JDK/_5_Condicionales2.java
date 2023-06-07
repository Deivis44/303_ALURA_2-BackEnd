package _1_JavaOrientadoObjetos._01_EntenderLenguaje._1_JavaJRE_JDK;

public class _5_Condicionales2 {
    public static void main(String[] args) {
        
        int edad = 28;
        int cantidadP = 2;

        boolean esPareja = cantidadP > 1;

        if (edad >= 18 && esPareja == true) {
            System.out.println("Ud puede entrar ;^)");
        } else {
            System.out.println("Ud no tiene permitido enntrar :^(");
        }
    }
}