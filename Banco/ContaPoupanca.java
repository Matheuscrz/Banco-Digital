package Java.Banco;

class ContaPoupanca extends conta {
    private static int Sequencial = 1;
    protected int cpf;
    protected String dataNascimento;
    protected String nacionalidade;
    protected int rg;
    public ContaPoupanca(int cpf, String dataNascimento, String nacionalidade, int rg) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.rg = rg;
        super.Agencia = Agencia_Padrao;
        super.conta = Sequencial++;
    }
    public static int getSequencial() {
        return Sequencial;
    }
    public static void setSequencial(int sequencial) {
        Sequencial = sequencial;
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
    @Override
    public void extrato() {
        System.out.println("=== Extrato da Conta ===");
        System.out.println(String.format("Agencia: %d", super.Agencia));
        System.out.println(String.format("Conta: %d", super.conta));
        System.out.println(String.format("Saldo: %d", super.saldo));
    }
}
