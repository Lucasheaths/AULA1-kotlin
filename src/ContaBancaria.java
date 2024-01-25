public class ContaBancaria {

    private String titular;
    private int numero;
    private double saldo;


    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}
