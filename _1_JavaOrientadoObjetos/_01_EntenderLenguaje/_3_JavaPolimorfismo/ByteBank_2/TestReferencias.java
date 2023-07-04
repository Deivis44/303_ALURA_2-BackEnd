package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class TestReferencias {
    public static void main(String[] args) {
        
        Trabajador trabajador1 = new Contador(0); // es normal
        trabajador1.setNombre("David");
        trabajador1.setSalario(2000);

        Gerente trabajador2 = new Gerente(1); // es gerente
        trabajador2.setNombre("Cristian");
        trabajador2.setSalario(10000);

        System.out.println("a");
    }
}
