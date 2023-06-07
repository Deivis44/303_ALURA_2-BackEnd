package _1_JavaOrientadoObjetos._01_EntenderLenguaje._1_JavaJRE_JDK;

public class _14_Factorial {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            long factorial = 1L;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("El factorial de " + i + " es: " + factorial);
        }
    }
}
