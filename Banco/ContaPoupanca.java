package Java.Banco;

class ContaEmpresarial extends conta{
    private static int Sequencial = 1;
    protected int cnpj;
    public ContaEmpresarial(int cnpj) {
        this.cnpj = cnpj;
        super.Agencia = Agencia_Padrao;
        super.conta = Sequencial++;
    }
    public static int getSequencial() {
        return Sequencial;
    }
    public static void setSequencial(int sequencial) {
        Sequencial = sequencial;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public void extrato() {
        System.out.println("=== Extrato da Conta ===");
        System.out.println(String.format("Agencia: %d", super.Agencia));
        System.out.println(String.format("Conta: %d", super.conta));
        System.out.println(String.format("Saldo: %d", super.saldo));
    }
}
