import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        // Define variáveis
        float salary, benefits, taxRate, netSalary;

        // Método validateFloat recebe a pergunta e retorna um valor float válido
        salary = validateFloat("Digite o valor do salário: R$ ");
        benefits = validateFloat("Digite o valor dos benefícios: R$ ");

        // Método calculateTaxRate recebe o valor do salário e retorna o valor da taxa de imposto
        taxRate = calculateTaxRate(salary);

        // Cálculo do salário líquido
        netSalary = salary - salary * taxRate + benefits;

        // saída do sistema
        System.out.printf("O salário final é igual a R$ %.2f", netSalary);
    }

    static float validateFloat (String text) {

        // Define variáveis
        String answer;
        float value;

        // Abre entrada do sistema
        Scanner scanner = new Scanner(System.in);

        // Imprime a pergunta recebida
        System.out.print(text);

        // Repete a pergunta atá que seja digitado um valor válido
        do {

            // Trata a entrada do usuário, retirando os espaços em branco das extremidades e troca a "," por "."
            answer = scanner.nextLine().trim().replace(",", ".");

            // Verifica se é possível realizar o casting de string para float
            try {
                value = Float.parseFloat(answer);
                break;
            } catch (Exception error) {

                // Se não for possível imprime uma nova solicitação de valor
                System.out.print("Digite um valor válido: R$ ");
            }
        } while (true);
        return value;
    }

    static float calculateTaxRate(float salary) {
        float tax = 0.0f;
        if (salary <= 1100.0) {
            tax = 0.05f;
        } else if (salary <= 2500.0) {
            tax = 0.1f;
        } else if (salary > 2500.0) {
            tax = 0.15f;
        }
        return tax;
    }
}
