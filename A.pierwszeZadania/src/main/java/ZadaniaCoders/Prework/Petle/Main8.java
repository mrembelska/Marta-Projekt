package ZadaniaCoders.Prework.Petle;

public class Main8 {
    public static void main(String[] args) {
        int n = 5;
        char g = '*';
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(g + " ");
            }
            System.out.println(g + " ");
        }

    }

}


/*
W pliku `Main8.java`, jest napisany program, który wypisuje w konsoli
schemat z `n` gwiazdek, taki jak poniżej.
Przeanalizuj go bardzo dokładnie.
Przykład dla  ```n = 5```:

```
* * * * *

* * * * *

* * * * *

* * * * *

* * * * *
```

Używamy do tego zadania pętli zagnieżdżonych!
 */