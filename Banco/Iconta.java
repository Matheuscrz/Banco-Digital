package Java.Banco;

public interface Iconta {
    void depositar(double valor);

    void sacar(double valor);

    void tranferir(double valor, conta contadestino);
    
    void extrato();
}
