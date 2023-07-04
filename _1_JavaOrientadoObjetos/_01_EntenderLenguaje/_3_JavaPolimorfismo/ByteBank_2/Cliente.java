package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public class Cliente implements Autenticable {

    private String nombre;
    private String numeroIdentidad;
    private String profesion;

    private AutenticacionUtil util;


    public Cliente() {
        this.util = new AutenticacionUtil();
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }
    public void setNumeroIdentidad(String numeroIdentidad) {
        this. numeroIdentidad = numeroIdentidad;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this. profesion = profesion;
    }


    // ! metodos de la interfaz
    @Override
    public void SetClave(String clave) {
        this.SetClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return (this.util.iniciarSesion(clave));
    }
}