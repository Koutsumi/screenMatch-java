public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");

        String title = "Top Gun: Maverick";
        int ano = 2022;
        boolean include = true;
        double score_one = 8.9;
        double score_two = 7;
        double media = (score_one + score_two) / 2;
        String resume = "Filme de avião";
        int classificacao = (int) media/2;

        String content;
        content = """
                Filme: %s
                Resumo:%s
                Nota do filme: %2f
                Estrelas: %d
                """.formatted(title, resume, media, classificacao);

        System.out.println(content);
    }
}