package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class Admin extends Trabajador implements Autenticable {

    private AutenticacionUtil util;

    public Admin(int tipo) {
        super(tipo);
        this.util = new AutenticacionUtil();    
    }
    
    @Override
    public double bonificacion() {
        return getSalario();
    }
    

    @Override
    public void SetClave(String clave) {
        this.SetClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return (this.util.iniciarSesion(clave));
    }
}