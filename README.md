package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

      
        // Using Collections.stream()
        List<String> cities = Arrays.asList("New York", "Los Angeles", "Chicago", "Houston");
        cities.stream().forEach(System.out::println);
        System.out.println("---------------");

        // Using Arrays.stream()
        double[] temperatures = {72.5, 68.0, 79.3, 85.7};
        IntStream tempStream = Arrays.stream(temperatures)
                                     .mapToInt(d -> (int) d); // Converting to IntStream
        tempStream.forEach(System.out::println);
        System.out.println("---------------");

        // Using Stream.of()
        Stream<String> animalsStream = Stream.of("Lion", "Elephant", "Zebra", "Giraffe");
        animalsStream.forEach(System.out::println);
        System.out.println("---------------");

        // Using Stream.generate()
        Stream<Integer> genStream = Stream.generate(() -> 10).limit(4);
        genStream.forEach(System.out::println);
        System.out.println("---------------");

        // Using Stream.iterate()
        Stream<Integer> iteStream = Stream.iterate(1, n -> n * 2).limit(5);
        iteStream.forEach(System.out::println);
        System.out.println("---------------");

        // Intermediate and Terminal Operations
        // filter()
        List<String> filteredCities = cities.stream().filter(city -> city.contains("o")).collect(Collectors.toList());
        System.out.println(filteredCities);
        System.out.println("---------------");

        // map()
        List<String> lowerCaseCities = cities.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerCaseCities);
        System.out.println("---------------");

        // sorted()
        List<Integer> numbers = Arrays.asList(34, 15, 89, 21, 56);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);
        System.out.println("---------------");

        // distinct()
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);
        System.out.println("---------------");

        // count()
        long uniqueCount = numbers.stream().distinct().count();
        System.out.println(uniqueCount);
        System.out.println("---------------");

        // reduce()
        int sum = numbers.stream().reduce(0, Integer:sum);
        System.out.println(sum);
    }
}
