package _1_JavaOrientadoObjetos._01_EntenderLenguaje._1_JavaJRE_JDK;

public class _12_Matriz {
    public static void main(String[] args) {
        
        int contador = 1;
        for (int fila = 1; fila <= 10; fila++) {
            for (int columna = 1; columna <= 10; columna++) {
                arreglarNum(contador++);
            }
            System.out.println();
        }
    }

    public static void arreglarNum(int num) {
        if (num < 10) {
            System.out.print("[  " + num + "]");
        } else if (num >= 10 && num < 100) {
            System.out.print("[ " + num + "]");
        } else {
            System.out.print("[" + num + "]");
        }
    }
}