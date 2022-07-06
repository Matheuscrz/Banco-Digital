package Java.Banco;

import javax.swing.JOptionPane;

public abstract class conta implements Iconta {
    protected static final int Agencia_Padrao = 1;
    protected int Agencia;
    protected String Cliente;
    protected int conta;
    protected double saldo = 0d;
    protected String Rua;
    protected String Bairro;
    protected String Cidade;
    protected String Estado;
    protected String Pais;
    protected int Cep;
    protected int numero;
    public static int getAgenciaPadrao() {
        return Agencia_Padrao;
    }
    public int getAgencia() {
        return Agencia;
    }
    public void setAgencia(int agencia) {
        Agencia = agencia;
    }
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String pais) {
        Pais = pais;
    }
    public int getCep() {
        return Cep;
    }
    public void setCep(int cep) {
        Cep = cep;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void sacar(double valor) {
        if(saldo >= valor) saldo -= valor;
        JOptionPane.showMessageDialog(null, "Saldo Insufuciente!");
    }
    @Override
    public void tranferir(double valor, conta contadestino) {
       this.sacar(valor);
        contadestino.depositar(valor);
    }
}
