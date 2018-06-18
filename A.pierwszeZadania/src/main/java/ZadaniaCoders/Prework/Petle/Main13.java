package ZadaniaCoders.Prework.Petle;

public class Main13 {
    public static void main(String[] args) {
        int points = 78;

        if ( points >= 0) {

            System.out.println("Ilość puntków wieksza niz 0");
        } else {
            System.out.println("Ilość puntków mniejsza niz 0");
        }

        if (points >= 100) {
            System.out.println("Ilość puntków wieksza 100");
        }else{
            System.out.println("Ilość puntków mniejsza bądz rowna 100");
        }

        if (points >= 99) {
            System.out.println("Ocena celująca");
        } else if (points >= 85) {
            System.out.println("Ocena bardzo dobra");
        } else if (points >= 70) {
            System.out.println("Ocena dobra");
        } else if (points >= 55) {
            System.out.println("Ocena dostateczna");
        } else if (points >= 40) {
            System.out.println("Ocena dopuszczalna");
        } else {
            System.out.println("Ocena niedostateczna");

        }
    }
}

/*
W pliku `Main13.java` napisz program, który wystawi ocenę z testu.

* `0 - 39` pkt - ocena niedostateczna
* `40 - 54` pkt - ocena dopuszczająca
* `55 - 69` pkt - ocena dostateczna
* `70 - 84` pkt - ocena dobra
* `85 - 98` pkt - ocena bardzo dobra
* `99 - 100` pkt - ocena celująca

1. Stwórz zmienną `points`, do której będzie przypisany wynik z
testu.
2. Na początku sprawdź czy ilość punktów jest większa bądź równa `0`, jeśli nie wypisz na stronie komunikat `Ilość punktów mniejsza niż 0.`
3. Na początku sprawdź czy ilość punktów jest mniejsza bądź równa `
100`, jeśli nie wypisz na stronie komunikat `Ilość punktów większa
niż 100.`
4. Następnie sprawdź jaka ocena odpowiada danej ilości punktów i
wypisz ją na stronie wg. wzoru `Wynik: ocena dobra`
5. Rozwiąż to zadanie używając raz konstrukcji `if ... elseif ...
else`.

 */
