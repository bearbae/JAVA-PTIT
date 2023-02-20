public class helloptit {

    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 110;
        for (int number = lowerbound; number <= upperbound; number++) {
            if (number % 11 == 0) {
                System.out.print(number + " \n");
            } else {
                System.out.print(number + "    ");
            }
        }
    }
}