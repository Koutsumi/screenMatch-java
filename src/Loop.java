import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double media = 0;
        double note = 0;
        int count = 0;

//        for (int i = 0; i < 3; i++){
//            System.out.println("Qual a sua nota para o filme?");
//
//            note = read.nextDouble();
//            media += note;
//        }

        while (note != -1){
            System.out.println("Qual a sua nota para o filme?");
            note = read.nextDouble();

            if(note != -1){
                media += note;
                count++;
            }else if(note == -1){
                System.out.println("Encerrado");
            }
        }

        System.out.println("Média = " + media/count);

    }

}
