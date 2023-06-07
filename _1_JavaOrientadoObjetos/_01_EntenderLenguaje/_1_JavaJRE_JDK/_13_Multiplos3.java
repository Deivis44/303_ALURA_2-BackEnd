package _1_JavaOrientadoObjetos._01_EntenderLenguaje._1_JavaJRE_JDK;

public class _13_Multiplos3 {
    public static void main(String[] args) {
        

        for (int numero = 1; numero <=100 ; numero++) {
            if (numero% 3 == 0) {
                System.out.println("Es un multiplo de 3: " + numero);
            }
        }
    }
}
