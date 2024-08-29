package Desafios.DesafioServicosTelefonia;

import java.util.Scanner;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itera sobre os serviços contratados
        for (String servico : servicosContratados){
            switch (servico) {
                case "movel" -> movelContratado = true;
                case "banda larga" -> bandaLargaContratada = true;
                case "tv" -> tvContratada = true;
            }
        }


        // Verifica se todos os serviços foram contratados
        if ((movelContratado && bandaLargaContratada && tvContratada)) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] servicosContratados = input.split(",");
        String resultado = verificarComboCompleto(servicosContratados);
        System.out.println(resultado);
        scanner.close();
    }
}
