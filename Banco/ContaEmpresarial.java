package Java.Banco;

class ContaEmpresarial extends conta{
    private int cnpj;

    public ContaEmpresarial(String cliente, int conta, double saldo, int tipo, String rua, String bairro, String cidade,
            String estado, String pais, int cep, int numero, int cnpj) {
        super(cliente, conta, saldo, tipo, rua, bairro, cidade, estado, pais, cep, numero);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}
