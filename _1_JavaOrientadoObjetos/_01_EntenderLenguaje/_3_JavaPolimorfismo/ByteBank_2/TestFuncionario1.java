package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class TestFuncionario1 {
    public static void main(String[] args) {

        Trabajador diegoFunc = new Contador(0);
        diegoFunc.setNombre("David");
        diegoFunc.setDocumento(1011200835);
        diegoFunc.setSalario(4000);

        System.out.println("\n"+ diegoFunc.getSalario());
        System.out.println("La bonificación del salario de diego es del 10%, eso es igual a: " + diegoFunc.bonificacion());
    }
}