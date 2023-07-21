package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o número da Agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita ao usuário que digite o número da Conta
        System.out.print("Por favor, digite o número da Conta: ");
        String numero = scanner.nextLine();

        // Solicita ao usuário que digite o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita ao usuário que digite o saldo
        System.out.print("Por favor, digite o saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        scanner.close();

        // Exibe a mensagem com os dados da conta informados pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
