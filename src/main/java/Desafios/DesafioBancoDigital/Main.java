package Desafios.DesafioBancoDigital;

public class Main {

    public static void main(String[] args) {

        Cliente adma = new Cliente("Adma");
        Cliente jose = new Cliente("Jose");

        Conta corrente = new Corrente(adma);
        Conta poupanca = new Poupanca(jose);

        corrente.depositar(100);
        poupanca.depositar(200);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        corrente.depositar(50);
        corrente.transferir(55, poupanca);
        poupanca.transferir(20, corrente);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
