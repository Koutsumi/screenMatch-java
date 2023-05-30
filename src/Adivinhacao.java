import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int random_number = new Random().nextInt(100);
        int user_number = 0;
        System.out.println("Número aleatório - " + random_number);
        for(int tentativa = 0; tentativa <= 5; tentativa++ ){
            System.out.println("Digite o número: ");
            user_number = read.nextInt();

            if(user_number < random_number){
                System.out.println("O número digitado é menor que o número do sistema");
            }else if(user_number > random_number){
                System.out.println("O número digitado é maior que o número do sistema");
            }else if(user_number == random_number){
                System.out.println("Parabéns!!!! Você acertou");
                break;
            }

        }
    }
}
