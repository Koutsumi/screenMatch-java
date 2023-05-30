import java.sql.SQLOutput;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String movie = read.nextLine();
        System.out.println("Qual o ano de lanćamento do filme?");
        int year_movie = read.nextInt();
        System.out.println("Qual a sua nota para o filme?");
        double score_movie = read.nextDouble();
        System.out.println("Seu filme favorito é: " + movie);
        System.out.println("Lanćado em: " + year_movie );
    }

}
