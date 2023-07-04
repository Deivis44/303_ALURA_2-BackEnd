package _1_JavaOrientadoObjetos._01_EntenderLenguaje._3_JavaPolimorfismo.ByteBank_2;

public abstract class Cuenta {

    private double saldo;
    private int agencia;
    private int numero;
    public Cliente titular;

    public Cuenta(int agencia, int numero) {
        this.numero = numero;

        if (agencia <= 0) {
            System.out.println("No se permite una agencia con valor 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean retirar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.retirar(valor);
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    // public void setAgencia(int agencia) {
    //     this.agencia = agencia;
    // }

    public int getAgencia(){
        return this.agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

}