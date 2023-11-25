// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int payment = 1100;
        int inTotal = initialAmount + payment;

        if (payment < 1000) {
            System.out.println("Итого =" + inTotal);
        } else {
            int inTotalAmount = inTotal + payment / 100;
            System.out.println("Итого =" + inTotalAmount);
        }


    }
}