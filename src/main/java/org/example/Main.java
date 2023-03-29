package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Przestawienie macierzowe 2b");
        System.out.println("Wybor Opcji:");
        System.out.println("1. Kodowanie");
        System.out.println("2. Dekodowanie");
        String mode = scanner.nextLine(); //pobieranie opcji
        int modeNr = Integer.parseInt(mode);
        String result = "";
        String inputText = "";
        String key = "";
        boolean exit = false;

        do {
            switch (modeNr) {
                case 1: { //KODOWANIE
                    System.out.println("Podaj tekst do zakodowania: ");
                    inputText = scanner.nextLine(); //wpisywanie tekstu do zakodowania
                    System.out.println("Podaj klucz: ");
                    key = scanner.nextLine(); //wpisywanie tekstu klucza
                    result = "Zakodowany tekst: " + Code(inputText, key);
                    exit = true;
                    break;
                }
                case 2: { //DEKODOWANIE
                    System.out.println("Podaj tekst do odkodowania: ");
                    inputText = scanner.nextLine(); //wpisywanie tekstu do odkodowania
                    System.out.println("Podaj klucz: ");
                    key = scanner.nextLine(); //wpisywanie tekstu klucza
                    result = "Zdekodowany tekst: " + Decode(inputText, key);
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Wybierz poprawna opcje:");
                    System.out.println("1. Kodowanie");
                    System.out.println("2. Dekodowanie");
                    mode = scanner.nextLine(); //pobieranie opcji
                    modeNr = Integer.parseInt(mode);
                }
            }
        } while (!exit);


        System.out.println(result);

    }


    public static String Code(String text, String key) {
        StringBuilder codedTextBuiler = new StringBuilder();
        String codedText = "";
        int[] keyArray = new int[key.length()];//inicjalizacja tablicy klucza


        for (int i = 0; i < key.length(); i++) {
            keyArray[i] = key.charAt(i) - 48;//zamiana cyfr, dużych liter i kilku znaków na wartości liczbowe od 0 do 42
        }

        for (int activeChar = 0; activeChar < 43; activeChar++) {//iteruje po kazdej cyfrze i dużej literze alfabetu (i paru znakach)
            for (int i = 0; i < key.length(); i++) {//iteruje po każdej pozycji w tablicy klucza
                if (keyArray[i] == activeChar) {//jezeli pozycja zgadza sie z aktywnie rozpatrywaną cyfrą lub literą
                    for (int j = i; j < text.length(); j += key.length()) {
                        codedTextBuiler.append(text.charAt(j));//...dodaje literę o takiej samej odleglosci od poczatku tekstu do kodowania jak rozpatrywana ma od początku klucza i każdą kolejną literę z tej samej kolumny macierzy (w odległości jednej długości klucza) do wyniku, po czym wraca do iterowania po pozycjach klucza
                    }
                }
            }
        }
        codedText = codedTextBuiler.toString();
        return codedText;
    }


    public static String Decode(String text, String keyString) {
        String decodedText = "";
        return decodedText;
    }
}