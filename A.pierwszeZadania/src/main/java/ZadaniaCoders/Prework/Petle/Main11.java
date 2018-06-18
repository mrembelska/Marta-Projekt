package ZadaniaCoders.Prework.Petle;

public class Main11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            String g = "";
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    g += (j + 1) + " ";
                } else {
                    g += "* ";
                }
            }

           System.out.println(g + g);


        }

    }

}


/*
W pliku `Main11.java` napisz program rysujący na podstawie wartości
 zmiennej `n` następujący schemat (tutaj dla ```n = 5```):

```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
* * * * *
* * * * 5
* * * 4 5
* * 3 4 5
* 2 3 4 5
```

Do stworzenia takiego zapisu w środku zagnieżdżonej pętli użyj
 wyrażenia warunkowego `if` dzięki któremu zdecydujesz czy wypisać
  gwiazdkę czy licznik z zagnieżdżonej pętli.
*/
