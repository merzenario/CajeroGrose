package models;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private String psw;
    private int intentosFallidos;

    public Cuenta(String numeroCuenta, String psw) {
        this.numeroCuenta = numeroCuenta;
        this.psw = psw;
        this.saldo = saldo;
        this.intentosFallidos = intentosFallidos;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }
    
}
