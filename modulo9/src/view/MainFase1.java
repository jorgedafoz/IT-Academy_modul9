package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static view.MainFase1.names;

public class MainFase1 {
    public static void main(String[] args) {
        MainFase1 exercice = new MainFase1();

        System.out.println("Exercice 1 - Names starting with 'a':");
        exercice.names();

        System.out.println("Exercice 2 - Numbers with 'e' and 'o':");
        exercice.numbersWithEO();

        System.out.println("Exercices 3 - Words containing 'o':");
        exercice.stringsWithO();

        System.out.println("Exercice 4 - Words at least 5 character long:");
        exercice.stringsWith5Char();

        System.out.println("Exercice 5 - Printing months with lambda:");
        exercice.months();

        System.out.println("Exercice 6 - Printing months with reference method:");
        exercice.monthsReference();
    }

    public static void names() {
        List<String> names = Arrays.asList("John", "Pepe", "Toni", "Ann", "Danniel", "Sarah", "Albert", "David", "Manuela");
        names.stream()
                .filter(s -> s.startsWith("A") && s.length()==3)
                .forEach(s->System.out.print(s +", "));
        System.out.println();
    }

    public static void numbersWithEO() {
        List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<String> newNumberList = new ArrayList();
        numbers.stream()
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer number) {
                        if(number % 2 == 0 ) {
                            newNumberList.add("e" + String.valueOf(number));
                        } else {
                            newNumberList.add("o" + String.valueOf(number));
                        }
                    }
                });
        System.out.println(newNumberList);
        System.out.println();
    }

    public void stringsWithO() {
        List<String> words = Arrays.asList("house", "pet", "airplane", "mountain", "phone", "sea");
        words.stream()
                .filter(s -> s.contains("o"))
                .forEach(s -> System.out.println(s));
    }

    public void stringsWith5Char() {
        List<String> words = Arrays.asList("house", "pet", "airplane", "mountain", "phone", "sea");
        words.stream()
                .filter(s -> s.length() >= 5)
                .forEach(s -> System.out.println(s));
    }

    public void months() {
        List<String> months = Arrays.asList("January", "February", "Marz", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.stream().forEach(s -> System.out.println(s));
    }

    public void monthsReference() {
        List<String> months = Arrays.asList("January", "February", "Marz", "April", "May", "June", "July", "August", "September", "October", "November", "December");
         months.forEach(System.out::println);
    }

}
