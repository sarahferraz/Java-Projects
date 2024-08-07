public class Condicional {
    public static void main(String[] args) {
        int releaseYear = 1990;
        boolean planUser = true;
        double movieRate = 8.1;
        String planType = "plus";

        if (releaseYear >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme rêtro que vale a pena assistir!");
        }

        if(planUser == true || planType.equals("plus")){
            System.out.println("Filme libarado");
        }else{
            System.out.println("Deve pagar a locação");
        }


    }
}
