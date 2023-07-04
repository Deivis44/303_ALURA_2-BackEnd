package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class TestSistema {
    public static void main(String[] args) {
        
        SistemaInterno sistema = new SistemaInterno();
        Gerente g1 = new Gerente(0);
        Admin ad = new Admin(0);

        sistema.autenticar(g1);
        sistema.autenticar(ad);
    }
}