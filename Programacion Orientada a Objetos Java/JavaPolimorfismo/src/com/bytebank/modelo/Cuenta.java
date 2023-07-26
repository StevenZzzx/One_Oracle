package com.bytebank.modelo;

/**
 * Cuenta va a crear nuevas instancias de cuentaCorriente
 * 
 * @version 1.0
 * @author Steven
 */

public abstract class Cuenta implements Comparable<Cuenta>{
    
    //public  //Accesible desde cualquier parte
    //--default //Accesible dentro del paquete
    //--protected //default + clases hijas
    //---private //solo desde la clase misma
    
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;
   
    /**
     * Instancia una cuenta usando agencia  
     * @param agencia 
     */
    public Cuenta(int numero,int agencia){
        this.numero = numero;
    	if (agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
        
    }

    // No retorna valor
    public abstract void depositar(double valor);

    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error
     * devuelve una excepcion
     * @param valor 
     * @throws SaldoInsuficienteException
     */
    public void retirar(double valor) {
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo -= valor;
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if(this.saldo >= valor){
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia > 0){
            this.agencia = agencia;
        }else{
            System.out.println("No estan permitidos valores negativos");
        }
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
    
    public void setNumero(int numero) {
		this.numero = numero;
	}
    
    public int getNumero() {
		return numero;
	}
    
    @Override
    public String toString() {
    	String cuenta = "Numero: " + this.numero + ", Agencia: " + this.agencia;
    	return cuenta;
    }
    
    
    @Override
    public boolean equals(Object obj) {
    	Cuenta cuenta = (Cuenta) obj;
    	return this.agencia == cuenta.getAgencia() &&
    			this.numero == cuenta.getNumero();
    }
    
    @Override
    public int compareTo(Cuenta o) {
    	// Orden natural: Numero Agencia
    	return Integer.compare(this.agencia, o.getAgencia());
    }
}
