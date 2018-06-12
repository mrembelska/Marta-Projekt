package ZadaniaCoders.Prework.Petle;

public class Main5 {
    public static void main(String[] args) {
        int resultFor = 0;
        //int resultWhile = 0;

        for (int i = 1; i<=10; i = i+1){
            resultFor = resultFor + i;
            for(int j = 1; j <=10; j = j+i){
                resultFor = resultFor + j;
                System.out.println(resultFor);
            }
        }

    }
}


/*
1. W pliku `Main5.java` stwórz zmienną `resultFor` oraz `resultWhile` i przypisz do nich liczbę `0`.
2. Następnie stwórz pętle, która doda do siebie liczby od 1 do 10 i zapisze do zmiennej `resultFor` lub `resultWhile`.
3. Pętla powinna co uruchomienie (zwaną także iteracją pętli) dodawać do zmiennej `resultFor` lub `resultWhile` kolejną liczbę z podanego zakresu.
4. Napisz zarówno pętle `for` jak i pętlę `while`.
5. Wypisz w konsoli w oddzielnych liniach zmienne `resultFor` oraz `resultWhile`.
 */