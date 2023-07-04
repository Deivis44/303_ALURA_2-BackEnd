package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class TestControl {
    public static void main(String[] args) {
        
        Trabajador diego = new Contador(0);
        diego.setSalario(2000);

        Gerente carlos = new Gerente(1);
        carlos.setSalario(10000);

        Contador martin = new Contador(1);
        martin.setSalario(5000);

        Control control = new Control();    
        control.registrarSalario(diego);
        control.registrarSalario(carlos);
        control.registrarSalario(martin);
    }
}