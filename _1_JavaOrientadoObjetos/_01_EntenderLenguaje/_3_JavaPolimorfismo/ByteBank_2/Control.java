package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class Control {
    
    private double suma;

    public double registrarSalario(Trabajador trabajador) {
        this.suma = trabajador.bonificacion() + this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }
}