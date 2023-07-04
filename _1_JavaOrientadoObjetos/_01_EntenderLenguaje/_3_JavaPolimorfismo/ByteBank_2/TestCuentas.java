package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class TestCuentas {
    public static void main(String[] args) {
        
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        cc.depositar(2000);
        CuentaAhorros ca = new CuentaAhorros(1, 1);
        cc.transferir(1000, ca);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CA: " + ca.getSaldo());
    }
}
