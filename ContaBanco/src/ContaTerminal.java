import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int accountNumber;
        String bankBranch, costumerName;
        double balance;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao Banco Java!");
        System.out.println("-=".repeat(10));

        System.out.println("Por favor, digite seu nome!");
        costumerName = scanner.next();

        System.out.println("Digite o número da Agência!");
        bankBranch = scanner.next();

        System.out.println("Digite sua conta!");
        accountNumber = scanner.nextInt();

        System.out.println("Digite se saldo!");
        balance = scanner.nextDouble();

        System.out.println("-=".repeat(10));
        System.out.println("Olá " + costumerName +
         ", obrigado por criar uma conta em nosso banco, sua agência é " +
         bankBranch + ", conta " + accountNumber + " e seu saldo " + balance +
         " já está disponível para saque.");

    }
}
