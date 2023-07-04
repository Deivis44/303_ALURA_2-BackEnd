package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class Gerente extends Trabajador implements Autenticable {

    public Gerente(int tipo) {
        super(tipo);
    }

    public Gerente(int tipo, int salario) {
        super(salario);
    }

    
    @Override
    public double bonificacion() {
        System.out.println("EJECUNTANDO DESDE GERENTE");
        return super.getSalario() + (super.getSalario() * 0.05); 
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("como estan?");
    }

    @Override
    public void SetClave(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SetClave'");
    }

    @Override
    public boolean iniciarSesion(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarSesion'");
    }

    public String GetClave() {
        return null;
    }
}