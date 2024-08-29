package Desafios.DesafioServicosTelefonia;

import java.util.Scanner;

public class VerificacaoServicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String servico = scanner.nextLine().trim();
        String entradaCliente = scanner.nextLine().trim();

        String [] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // Verifica se o serviço está na lista de serviços contratados
        for (String parte : partes)
            if (parte.equals(servico)) {
                contratado = true;
                break;
            }
        String resultado = contratado ? "Sim" : "Não" ;
        System.out.println(resultado);
        scanner.close();
    }
}
