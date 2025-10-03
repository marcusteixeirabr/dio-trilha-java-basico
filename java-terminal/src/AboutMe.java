import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        String name = args[0];
        String surname = args[1];
        byte age = Byte.parseByte(args[2]);
        float height = Float.parseFloat(args[3]);

        System.out.println("Olá, me chamo " + name + " " + surname + ".");
        System.out.println("Tenho " + age + " anos.");
        System.out.println("Minha altura é " + height + "m.");
        System.out.println("-=".repeat(10));

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        name = scanner.nextLine();
        System.out.print("Digite se sobrenome: ");
        surname = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        age = scanner.nextByte();
        System.out.print("Digite sua altura: ");
        height = scanner.nextFloat();
        System.out.println("-=".repeat(10));


        System.out.println("Olá, me chamo " + name + " " + surname + ".");
        System.out.println("Tenho " + age + " anos.");
        System.out.println("Minha altura é " + height + "m.");
        System.out.println("-=".repeat(10));




    }

}
