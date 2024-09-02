package Desafios.DesafioBancoDigital;

public class Conta implements InterfaceBanco {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public String tipoConta() {
        return "";
    }

    public void transferir (double valor, Conta contaDestino) {
        if (tipoConta().equals("Conta Corrente")) {
            transferir(valor, contaDestino);
        } else {
            System.out.println("Ação inoperante devido ao tipo de conta (Poupança)." + "\n");
        }
    }

    protected void imprimirExtrato() {
        System.out.println("--Cliente: " + cliente.getNome());
        System.out.println("--Tipo Conta: " + tipoConta());
        System.out.println("--Agência: " + agencia);
        System.out.println("--Número: " + numero);
        System.out.println("--Saldo: " + saldo + "\n") ;

    }
}
