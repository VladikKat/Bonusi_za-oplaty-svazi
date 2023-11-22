// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int isnachalna_summa = 100;
        int oplata = 1100;
        int itogo = isnachalna_summa + oplata;

        if (oplata < 1000) {
            System.out.println("Итого =" + itogo);
        } else {
            int itogo1 = itogo + oplata / 100;
            System.out.println("Итого =" + itogo1);
        }


    }}