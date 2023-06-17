package _1_JavaOrientadoObjetos._01_EntenderLenguaje._2_JavaOO.ByteBank;

public class CrearCuenta {
    public static void main(String[] args) {

        Bienvenida bienvenida = new Bienvenida();
        bienvenida.preguntas();
        
        Cuenta cuenta1 = new Cuenta();
        cuenta1.depositar(1000);

        System.out.println(cuenta1.getSaldo()); 
        
        Cuenta cuenta2 = cuenta1;
        cuenta2.depositar(50);

        System.out.println("La primera cuenta tiene: " + cuenta1.getSaldo());
        System.out.println("La segunda cuenta tiene: " + cuenta2.getSaldo());


        System.out.println("\n PRUEBA DE METODOS\n");
        Cuenta cuentap1 = new Cuenta();

        System.out.println("Para la cuenta de prueba1:"); //
        cuentap1.depositar(400);
        System.out.println("Tu dinero actual es: " + cuentap1.getSaldo());
        
        cuentap1.retirar(100);
        System.out.println("Tu dinero actual es: " + cuentap1.getSaldo());
        
        
        System.out.println("\nPara la cuenta de prueba2:"); //
        Cuenta cuentap2 = new Cuenta();
        cuentap2.depositar(1000);
        System.out.println("Tu dinero actual es: " + cuentap2.getSaldo());

        cuentap2.transferir(400, cuentap1);
        System.out.println("Saldo de cuenta prueba2: " + cuentap2.getSaldo());
        System.out.println("Saldo de cuenta prueba1: " + cuentap1.getSaldo());

        
        // ? referenciando objetos en los atributos de una clase
        Cuenta cuentaConClases = new Cuenta();
        Cliente cliente = new Cliente();

        cuentaConClases.titular = cliente;
        cuentaConClases.titular.setNombre("David");

        System.out.println(cuentaConClases.titular.getNombre());
    }
}