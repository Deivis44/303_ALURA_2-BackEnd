package _1_JavaOrientadoObjetos._01_EntenderLenguaje._1_JavaJRE_JDK;

public class _11_Ciclos3 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("- TABLA DEL " + i + " -\n");

            for (int j = 1; j <= 10; j++) {
                System.out.println("> " + i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}