import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        // Insere quebra de linha
        scanner.nextLine();

        // Solicita o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo inicial
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Concatenação para exibir a mensagem final
        String mensagem = "Olá ".concat(nomeCliente)
                                .concat(", tudo bem? Obrigado por criar uma conta em nosso banco, sua agência é ")
                                .concat(agencia)
                                .concat(", conta ")
                                .concat(String.valueOf(numeroConta)) // O método String.valueOf() converte o int para string
                                .concat(" e seu saldo ")
                                .concat(String.valueOf(saldo))
                                .concat(" já está disponível para saque.");

        // Exibe a mensagem
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}
