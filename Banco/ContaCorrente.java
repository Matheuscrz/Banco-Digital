package Java.Banco;

class ContaCorrente extends conta {
        private int cpf;
        private String dataNascimento;
        private String nacionalidade;
        private int rg;
        private String profissao;
        private  Double salarioBruto;
        private boolean cartaoCredito;
        public ContaCorrente(String cliente, int conta, double saldo, int tipo, String rua, String bairro,
                String cidade, String estado, String pais, int cep, int numero, int cpf, String dataNascimento,
                String nacionalidade, int rg, String profissao, Double salarioBruto, boolean cartaoCredito) {
            super(cliente, conta, saldo, tipo, rua, bairro, cidade, estado, pais, cep, numero);
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
            this.nacionalidade = nacionalidade;
            this.rg = rg;
            this.profissao = profissao;
            this.salarioBruto = salarioBruto;
            this.cartaoCredito = cartaoCredito;
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
        
}
