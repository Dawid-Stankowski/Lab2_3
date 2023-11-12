import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Tworzenie dwóch różnych tablic i wypełnianie ich liczbami
        int[] tablica1 = {10, 25, 67, 32, 55};
        int[] tablica2 = {43, 10, 20, 54, 19};

        // 1. Oblicz sumę wszystkich elementów w tablicy 1 i 2
        int suma1 = Arrays.stream(tablica1).sum();
        int suma2 = Arrays.stream(tablica2).sum();
        System.out.println("Suma tablicy 1: " + suma1);
        System.out.println("Suma tablicy 2: " + suma2);

        // 2. Znajdź maksymalną i minimalną wartość dla każdej tablicy
        int max1 = Arrays.stream(tablica1).max().getAsInt();
        int min1 = Arrays.stream(tablica1).min().getAsInt();
        int max2 = Arrays.stream(tablica2).max().getAsInt();
        int min2 = Arrays.stream(tablica2).min().getAsInt();
        System.out.println("Max tablicy 1: " + max1 + ", Min tablicy 1: " + min1);
        System.out.println("Max tablicy 2: " + max2 + ", Min tablicy 2: " + min2);

        // 3. Oblicz średnią wszystkich wartości w tablicy
        double srednia1 = Arrays.stream(tablica1).average().orElse(Double.NaN);
        double srednia2 = Arrays.stream(tablica2).average().orElse(Double.NaN);
        System.out.println("Średnia tablicy 1: " + srednia1);
        System.out.println("Średnia tablicy 2: " + srednia2);

        // 4. Utwórz kopię istniejącej tablicy
        int[] kopiaTablicy1 = Arrays.copyOf(tablica1, tablica1.length);
        int[] kopiaTablicy2 = Arrays.copyOf(tablica2, tablica2.length);
        System.out.println("Kopia tablicy 1: " + Arrays.toString(kopiaTablicy1));
        System.out.println("Kopia tablicy 2: " + Arrays.toString(kopiaTablicy2));

        // 5. Wybierz elementy z tablicy, które spełniają określone kryterium
        int[] przefiltrowanaTablica1 = Arrays.stream(tablica1).filter(x -> x > 2).toArray();
        int[] przefiltrowanaTablica2 = Arrays.stream(tablica2).filter(x -> x > 5).toArray();
        System.out.println("Elementy > 2 z tablicy 1: " + Arrays.toString(przefiltrowanaTablica1));
        System.out.println("Elementy > 5 z tablicy 2: " + Arrays.toString(przefiltrowanaTablica2));

        // 6. Usuń określony element z tablicy
        int elementDoUsuniecia = 3;
        int[] nowaTablica1 = Arrays.stream(tablica1).filter(x -> x != elementDoUsuniecia).toArray();
        System.out.println("Tablica 1 bez elementu " + elementDoUsuniecia + ": " + Arrays.toString(nowaTablica1));

        // 7. Połącz tablice 1 i 2 a wynik zapisz w nowej tablicy
        int[] polaczonaTablica = new int[tablica1.length + tablica2.length];
        System.arraycopy(tablica1, 0, polaczonaTablica, 0, tablica1.length);
        System.arraycopy(tablica2, 0, polaczonaTablica, tablica1.length, tablica2.length);
        System.out.println("Połączone tablice: " + Arrays.toString(polaczonaTablica));

        // 8. Znajdź liczbę wystąpień określonej wartości w tablicy 2
        int wartoscDoZnalezienia = 5;
        long liczbaWystapien = Arrays.stream(tablica2).filter(x -> x == wartoscDoZnalezienia).count();
        System.out.println("Liczba wystąpień wartości " + wartoscDoZnalezienia + " w tablicy 2: " + liczbaWystapien);
    }
}
