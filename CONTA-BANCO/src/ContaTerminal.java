import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agora digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia +
            ", conta " + numero + 
            " e seu saldo R$ " + String.format("%.2f", saldo) + 
            " já está disponível para saque.");

        scanner.close();

    }
}
