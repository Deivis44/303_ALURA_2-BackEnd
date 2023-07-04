package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class Contador extends Trabajador {

    public Contador(int tipo) {
        super(tipo);
    }

    @Override
    public double bonificacion() {
        System.out.println("EJECUTANTO DESDE CONTADOR");
        return 200;
    }
    
}