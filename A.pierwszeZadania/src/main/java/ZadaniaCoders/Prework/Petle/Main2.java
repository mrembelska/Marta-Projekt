package ZadaniaCoders.Prework.Petle;

public class Main2 {
    public static void main(String[] args) {
        int nr1 = 1;
        int nr2 = 2;
        int nr3 = 3;

        if (nr1 > nr2 && nr1 > nr3) {
            System.out.println("Największa z liczb " + nr1 + " " + nr2 +" " + nr3 +" to: " + nr1);
        } else if (nr2 > nr1 && nr2 > nr3) {
            System.out.println("Największa z liczb " + nr1 + " " + nr2 + " " + nr3 +" to: " + nr2);
        } else {
            System.out.println("Największa z liczb " + nr1 + " " + nr2 + " " + nr3 +" to: " + nr3);
        }

    }
}
/*
1. W pliku `Main2.java` stwórz trzy zmienne, o nazwach `nr1, nr2, nr3` , przechowujące liczby całkowite.
2. Następnie za pomocą instrukcji warunkowej `if ... elseif ... else`, wypisz na stronie, która z nich jest największa.
3. Wypisany string ma być wg. wzoru `Największa z liczb 7,2,11 to 11.
 */