package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean retirar(double valor) {
        double comision = 0.2;
        return super.retirar(valor + comision);
    }
    
}
