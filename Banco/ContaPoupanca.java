package Java.Banco;

class ContaPoupanca extends conta {
    private int cpf;
    private String dataNascimento;
    private String nacionalidade;
    private int rg;
    public ContaPoupanca(String cliente, int conta, double saldo, int tipo, String rua, String bairro, String cidade,
            String estado, String pais, int cep, int numero, int cpf, String dataNascimento, String nacionalidade,
            int rg) {
        super(cliente, conta, saldo, tipo, rua, bairro, cidade, estado, pais, cep, numero);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.rg = rg;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
}
