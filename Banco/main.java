package Java.Banco;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        conta cc = new ContaCorrente(011, "15/05/2000", "Aracaju", 353, "desenvolver", 2000d, true);
        conta poupanca = new ContaPoupanca(021, "15/02/1988", "Socorro", 46466);
        conta empresa = new ContaEmpresarial(54644);

        cc.extrato();
        poupanca.extrato();
        empresa.extrato();
    }
}
