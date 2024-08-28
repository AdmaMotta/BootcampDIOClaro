package Desafios.DesafioBancoTerminal;

public class BancoTerminal {
    public static void main(String[] args) {

        double saldo = 15;
        double valorSolicitado = 22;

        if (saldo > valorSolicitado) saldo = saldo - valorSolicitado;
        else System.out.println("Saldo insuficente");

        System.out.println(saldo);

    }
}
