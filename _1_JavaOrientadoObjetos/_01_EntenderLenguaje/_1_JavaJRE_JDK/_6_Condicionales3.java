package _1_JavaOrientadoObjetos._01_EntenderLenguaje._1_JavaJRE_JDK;

public class _6_Condicionales3 {
    public static void main(String[] args) {
        
        double valorCompra = 250.0;
        double descuento = 0.0;

        if (valorCompra >= 100.0 && valorCompra < 199.9) {
            descuento = 0.1;
        } else if (valorCompra >= 200.0 && valorCompra < 299.9){
            descuento = 0.15;
        } else if (valorCompra >= 300.0) {
            descuento = 0.2;
        }

        double valorFinal = valorCompra - (valorCompra * descuento);

        System.out.println("El valor de tu compra fue: " + valorCompra + "$");
        System.out.println("El descuento que se te aplica es de: " + descuento + "$");
        System.out.println("En total te queda en un valor de: " + valorFinal + "$");

    }
}
