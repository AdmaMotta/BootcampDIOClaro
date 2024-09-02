package Desafios.DesafioBancoDigital;

public class Poupanca extends Conta{

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String tipoConta() {
        return "Conta Poupanca";
    }
}
