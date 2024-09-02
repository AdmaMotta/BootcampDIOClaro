package Desafios.DesafioBancoDigital;

public class Corrente extends Conta{


    public Corrente(Cliente cliente) {
        super(cliente);
    }

    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência realizada com sucesso.");
    }

    @Override
    public String tipoConta() {
        return "Conta Corrente";
    }
}
