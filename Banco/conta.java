package Java.Banco;

import javax.swing.JOptionPane;

class conta {
    private static final int Agencia = 1;
    private String Cliente;
    private int conta;
    private double saldo = 0 ;
    private int tipo;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Pais;
    private int Cep;
    private int numero;
    public conta(String cliente, int conta, double saldo, int tipo, String rua, String bairro, String cidade,
            String estado, String pais, int cep, int numero) {
        Cliente = cliente;
        this.conta = conta;
        this.saldo = saldo;
        this.tipo = tipo;
        Rua = rua;
        Bairro = bairro;
        Cidade = cidade;
        Estado = estado;
        Pais = pais;
        Cep = cep;
        this.numero = numero;
    }
    public static int getAgencia() {
        return Agencia;
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
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
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
    void depositar(Double valor) {
        saldo += valor;
    }
    void sacar(Double valor) {
        if(saldo >= valor) saldo -= valor;
        JOptionPane.showMessageDialog(null, "Saldo Insufuciente!"); 
    }
    void tranferir(int tipo, int conta, Double valor){
        this.sacar(valor);
        //
    }
    void pix(int key, Double valor){

    }
}