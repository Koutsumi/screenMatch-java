import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = "Sarah Lenn";
        String typeAccount = "Corrente";
        double balance = 1600.00;
        double value = 0;

        String output = ("""
                Nome do cliente: %s
                Conta: %s
                Saldo da conta: %2f
                """.formatted(name, typeAccount, balance));

        String menu = ("""
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                """);

        int option = 0;

        System.out.println("--------------------");

        System.out.println(output);

        System.out.println("--------------------");

        while(option != 4){
            System.out.println("***** M E N U *****");
            System.out.println(menu);
            System.out.println("***** ******* *****");
            System.out.println("Qual operaćão deseja realizar?");
            option = read.nextInt();

            switch (option){
                case 1:

                    System.out.println("Saldo atual:" + balance);

                    break;

                case 2:
                    System.out.println("Qual valor deseja transferir?");
                    value = read.nextDouble();

                    if(balance >= value){
                        balance -= value;
                        System.out.println("Transferência realizada com sucesso");
                        System.out.println("Seu saldo atual: " + balance);

                    }else if(balance < value){
                        System.out.println("Saldo insuficiente");
                    }

                    break;

                case 3:

                    System.out.println("Qual valor deseja depositar?");
                    value = read.nextDouble();
                    balance += value;
                    System.out.println("Deposito realizado com sucesso");
                    System.out.println("Seu saldo atual: " + balance);

                    break;
            }
        }

    }

}
