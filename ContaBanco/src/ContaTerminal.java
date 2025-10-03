// Importa bibliotecas da classe
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Declara variáveis
        int accountNumber;
        String bankBranch, costumerName;
        double balance;

        // Cria objeto scanner para receber os dados do cliente
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Imprime as perguntas para orientar a digitação dos dados do cliente
        System.out.println("Bem-vindo ao Banco Java!");
        System.out.println("-=".repeat(15));

        // Solicita o nome do cliente
        System.out.println("Por favor, digite seu nome!");
        costumerName = scanner.next();

        // Solocita a agência do cliente
        System.out.println("Digite o número da Agência!");
        bankBranch = scanner.next();

        // Solicita a conta do cliente
        System.out.println("Digite sua conta!");
        accountNumber = scanner.nextInt();

        // Solicita o saldo do cliente
        System.out.println("Digite se saldo!");
        balance = scanner.nextDouble();

        // imprime a resposta dos sistema com os dados digitados do cliente
        System.out.println("-=".repeat(15));
        System.out.println("Olá " + costumerName +
         ", obrigado por criar uma conta em nosso banco, sua agência é " +
         bankBranch + ", conta " + accountNumber + " e seu saldo " + balance +
         " já está disponível para saque.");
    }
}
