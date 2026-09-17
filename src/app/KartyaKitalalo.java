package app;
 
import java.util.Scanner;

public class KartyaKitalalo {
    static Scanner scanner = new Scanner(System.in);
 
    static String[] pakli = new String[22];
 
    public static void main(String[] args) {

        FeltoltT();

        for (int i = 0; i < 3; i++) {

            Kirak(); //1 darab tömb

            int oszlop = Melyik(); //input - Scanner

            Kever(oszlop); //középre

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
 
    private static int Melyik() {

    int oszlop;

    do {
        System.out.print("Melyik oszlopban van a kártyád? (1-3): ");
        oszlop = scanner.nextInt();

        if (oszlop < 1 || oszlop > 3) {
            System.out.println("Hibás érték! 1, 2 vagy 3 lehet.");
        }

    } while (oszlop < 1 || oszlop > 3);
    return oszlop;
}
 
    private static void Kever(int oszlop) {
        //kesobb
        
        String[] uj = new String [22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i < 7; i++) {
                    uj[i]=pakli[20-(i-1)*3];
                    uj[i+7]=pakli[19-(i-1)*3];
                    uj[i+14]=pakli[21-(i-1)*3]; 
                }
                break;
            case 2:
                for (int i = 1; i < 7; i++) {
                    uj[i+7]=pakli[19-(i-1)*3];
                    uj[i]=pakli[20-(i-1)*3];
                    uj[i+14]=pakli[21-(i-1)*3];   
                }
                break;
            case 3:
                for (int i = 1; i < 7; i++) {
                    uj[i+7]=pakli[19-(i-1)*3];
                    uj[i+14]=pakli[21-(i-1)*3];
                    uj[i]=pakli[20-(i-1)*3];     
                }
                break;
                
                
            default:
                throw new AssertionError();
        }
    }
 
    private static void EzVolt() {
        System.out.println("A kiválasztott lap: " + pakli[11]);
    }
 
}//class

 