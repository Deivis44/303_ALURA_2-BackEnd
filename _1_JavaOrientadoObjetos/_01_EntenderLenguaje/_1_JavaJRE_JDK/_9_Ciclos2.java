package _1_JavaOrientadoObjetos._01_EntenderLenguaje._1_JavaJRE_JDK;

public class _9_Ciclos2 {
    public static void main(String[] args) {
        
        int contador = 1;
        int total = 0;

        while (contador <= 10) {
            total = total + contador;
            contador++;
            System.out.println(total);
        }
    }
}
