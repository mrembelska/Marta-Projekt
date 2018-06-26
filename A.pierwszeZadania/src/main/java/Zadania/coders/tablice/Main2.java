package Zadania.coders.tablice;

public class Main2 {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Bananna"};
        System.out.println("Pierwszy owoc to: " + fruits[0]);
        System.out.println("Ostati owoc to: " + fruits[2]);

        for (int i = 0; i< fruits.length; i++ ){
            System.out.println(fruits[i]);
        }

    }
}

/*
W pliku `Main2.java` stwórz tablicę z listą swoich ulubionych owoców,
 zmienną z tablicą nazwij `fruits`.

Następnie:

1. Wypisz **pierwszy** owoc na stronie wg. wzoru: `Pierwszy owoc to:
 truskawka`.
2. Wypisz **ostatni** owoc na stronie wg. wzoru: `Ostatni owoc to:
 malina` (skorzystaj z `length`).
3. W pętli wypisz wszystkie owoce **każdy w nowej linii**
(skorzystaj z `length`).
 */