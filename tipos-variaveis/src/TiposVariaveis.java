public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double salarioMinimo = 2500.00;

        byte idade = 123;
        short ano = 2021;
        int cep = 27300560; // se o CEP começar com zero, temos que utilizar outro tipo de variável
        long cpf = 98787654399L; // se o CPF começar com zero, temos que utilizar outro tipo de variável
        float pi = 3.14F;
        double salario = 1274.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14;

        String meuNome = "João";

        byte d = 10, m =11;
        short a = 1981;
        Data dataNascimento = new Data(d, m, a);
        System.out.println(dataNascimento.getDataCompleta());
        
        System.out.println(++idade);

        byte x = 3, y = 4;
        String result = x == y ? "Verdadeiro" : "Falso";
        System.out.println(result);

        byte number1 = 1, number2 = 2;
        boolean yesNot = number1 != number2;
        System.out.println("A variável number1 é diferente da variável number2 ? " + yesNot);

        String name1 = "José";
        String name2 = new String("José");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));



    }

    

}
