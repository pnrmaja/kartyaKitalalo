package app;
 
import java.util.Scanner;

public class KartyaKitalalo {
 
    static String[] pakli = new String[22];
 
    public static void main(String[] args) {

        FeltoltT();

        for (int i = 0; i < 3; i++) {

            Kirak(); //1 darab tömb

            Melyik(); //input - Scanner

            Kever(); //középre

        }

        EzVolt(); //11.elem, azaz a középső lap

        //pkali tömb kiírása

        for (int i = 0; i < pakli.length; i++) {

            System.out.println(i + " " + pakli[i]);
 
        }

    }//main
 
    private static void FeltoltT() {

        String[] szinek = {"P", "T", "Z", "M"};

        String[] kartyak = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int db = 0;

        for (String szin : szinek) {

            for (String kartya : kartyak) {

                String lap = szin + "_" + kartya;

                if (db < 21) {

                    pakli[++db] = lap;

                }

            }

        }

//        for (String szin : szinek) {

//            for (String kartya : kartyak) {

//                if (db < 21) {          // vagy < 21, ha 21 lap kell

//                    Pakli[++db] = szin + "_" + kartya;

//                }

//            }

//        }

    }
 
    private static void Kirak() {

    int index = 1;

    for (int i = 0; i < 7; i++) {

        for (int j = 0; j < 3; j++) {
            System.out.print(pakli[index] + "\t");
            index++;
        }

        System.out.println();
    }
}
 
    private static void Melyik() {

    Scanner scanner = new Scanner(System.in);

    int oszlop;

    do {
        System.out.print("Melyik oszlopban van a kártyád? (1-3): ");
        oszlop = scanner.nextInt();

        if (oszlop < 1 || oszlop > 3) {
            System.out.println("Hibás érték! 1, 2 vagy 3 lehet.");
        }

    } while (oszlop < 1 || oszlop > 3);

}
 
    private static void Kever() {
        //kesobb
    }
 
    private static void EzVolt() {
        System.out.println("A kiválasztott lap: " + pakli[11]);
    }
 
}//class

 