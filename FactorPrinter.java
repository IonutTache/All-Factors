public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int divider = 0;
        while ( divider <= number){
            divider++;
            if (number % divider == 0){
                System.out.println(divider);
            }

        }
    }
}

