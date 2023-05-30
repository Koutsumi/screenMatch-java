import java.time.LocalDate;

public class Condicional {

    public static void main(String[] args) {

        int movie_year = 2022;
        boolean includePlan = true;
        double score = 8.1;
        String plan = "normal";
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        if(movie_year ==  currentYear){
            System.out.println("Lanćamento");
        } else if(movie_year <  currentYear){
            System.out.println("Filme retro");
        }

        if(includePlan || plan.equals("plus")){
            System.out.println("Filme disponível");
        }
    }

}
