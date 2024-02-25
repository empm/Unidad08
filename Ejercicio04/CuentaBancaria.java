package Ejercicio04;

abstract class CuentaBancaria {

    // Atributos
    protected String numeroCuenta;
    protected double saldo;
    public static final double interesAnualBasico = 2.5f;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Getters & Setters
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos
    public void ingresar(double x) {
        this.saldo += x;
    }

    public void retirar(double x) {
        this.saldo -= x;
    }

    public void traspaso(CuentaBancaria cc, double cant) {
        cc.retirar(cant);
        this.ingresar(cant);
    }

    // Consultar sobre este método
    private void anayir(double cantidad) {
    }

    abstract void calcularIntereses();

    public void mostrar() {
        System.out.println(this.numeroCuenta + " " + this.saldo);
    }

    public static void main(String[] args) {
        System.out.println(CuentaBancaria.interesAnualBasico);
        CuentaCorriente cc1 = new CuentaCorriente("C1", 0.0);
        CuentaCorriente cc2 = new CuentaCorriente("C2", 2000.0);
        CuentaAhorro cc3 = new CuentaAhorro("C3", 2000.0);
        cc2.traspaso(cc3, 1999.0);
        cc1.ingresar(1000.0);
        cc1.retirar(500.0);
        cc1.calcularIntereses();
        cc2.calcularIntereses();
        cc3.calcularIntereses();
        cc1.mostrar();
        cc2.mostrar();
        cc3.mostrar();
    }
}

// CuentaCorriente
class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    public void calcularIntereses() {
        this.saldo = (interesAnualBasico * this.saldo) / 100 + this.saldo;
    }

}

// CuentaAhorro
class CuentaAhorro extends CuentaBancaria {

    final double saldoMinimo = 3000f;

    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    public void calcularIntereses() {
        if (this.saldo < saldoMinimo) {
            this.saldo = ((interesAnualBasico / 2) * this.saldo) / 100 + this.saldo;
        } else {
            this.saldo = ((interesAnualBasico * 2) * this.saldo) / 100 + this.saldo;
        }
    }
}