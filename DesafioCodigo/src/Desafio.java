import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        float salary, benefits, tax, netSalary;
        salary = validateFloat("Digite o valor do salário: R$ ");
        benefits = validateFloat("Digite o valor dos benefícios: R$ ");
        tax = calculateTax(salary);
        netSalary = salary - salary * tax + benefits;
        System.out.printf("O salário final é igual a R$ %.2f", netSalary);
    }

    static float validateFloat (String text) {
        String answer;
        float value;
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        do {
            answer = scanner.nextLine().trim().replace(",", ".");
            try {
                value = Float.parseFloat(answer);
                break;
            } catch (Exception error) {
                System.out.print("Digite um valor válido: R$ ");
            }
        } while (true);
        return value;
    }

    static float calculateTax(float salary) {
        float tax = 0.0f;
        if (salary <= 11000.0) {
            tax = 0.05f;
        } else if (salary <= 25000.0) {
            tax = 0.1f;
        } else if (salary > 25000.0) {
            tax = 0.15f;
        }
        return tax;
    }
}
