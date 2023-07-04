package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public abstract class Trabajador { // tiene una bonficiación del 10%
    
    private String nombre;
    private int documento;
    private int salario;
    private int tipo;


    public Trabajador(int tipo) {
        this.tipo = tipo;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public abstract double bonificacion();

    public void saludar() {
        System.out.println("hola amigos");
    }
}