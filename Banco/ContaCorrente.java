package Java.Banco;

class ContaCorrente extends conta {
    private static int Sequencial = 1;
    protected int cpf;
    protected String dataNascimento;
    protected String nacionalidade;
    protected int rg;
    protected String profissao;
    protected  Double salarioBruto;
    protected boolean cartaoCredito;
    public ContaCorrente(int cpf, String dataNascimento, String nacionalidade, int rg, String profissao,
            Double salarioBruto, boolean cartaoCredito) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.rg = rg;
        this.profissao = profissao;
        this.salarioBruto = salarioBruto;
        this.cartaoCredito = cartaoCredito;
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
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public Double getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public boolean isCartaoCredito() {
        return cartaoCredito;
    }
    public void setCartaoCredito(boolean cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
    @Override
    public void extrato() {
        System.out.println("=== Extrato da Conta ===");
        System.out.println(String.format("Agencia: %d", super.Agencia));
        System.out.println(String.format("Conta: %d", super.conta));
        System.out.println(String.format("Saldo: %d", super.saldo));
    }
}
