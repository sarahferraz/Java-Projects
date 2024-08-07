public class Main {
    public static void main(String[] args) {
        System.out.println("This is  Screen Match");
        System.out.println(" Movie: Top Gun: Maverick ");;

        int releaseYear = 2022;
        boolean planUser = true;
        System.out.println("Release Year: " + releaseYear);
        double movieRate = 8.1;
        double average = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(average);
        String synopsis;
        synopsis = """
                Adventure film with 80s famous actor
                Release year: 
                 """ + releaseYear;

        System.out.println(synopsis);
        int stars = (int) (average/2);
        System.out.println(stars);


    }
}