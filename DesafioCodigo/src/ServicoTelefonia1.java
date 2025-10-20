import java.util.Scanner;

public class ServicoTelefonia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o serviço pesquisado: ");
        String service = scanner.nextLine().trim();

        System.out.print("Digite o nome do cliente e os serviços contratados separados por vírgula: ");
        String contract = scanner.nextLine().trim();

        String[] dataClient = contract.split(",");

        boolean isContracted = false;

        for (int i = 1; i < dataClient.length; i++) {
            if (service.equals(dataClient[i])) {
                isContracted = true;
            }
        }

        if (isContracted) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

//        System.out.println(service);
//
//        for (String data : dataClient) {
//            System.out.println(data);
//        }

        scanner.close();

    }
}
