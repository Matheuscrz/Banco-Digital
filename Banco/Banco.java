package Java.Banco;

import java.util.List;

public class Banco {
    private String nome;
    private List<conta> contas;
    public Banco(String nome, List<conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<conta> getContas() {
        return contas;
    }
    public void setContas(List<conta> contas) {
        this.contas = contas;
    }
}
