package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Tigran Melkonyan
 * Date: 5/31/25
 * Time: 12:35 PM
 */
public class FlattenTheList {
    public static void main(String[] args) {
        List<List<String>> list = List.of(List.of("a", "b", "c"), List.of("d", "e", "f"));

        List<String> res = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(res);

        //without flatMap
        List<Stream<String>> streamList = list
                .stream()
                .map(subList -> subList.stream()).toList();

        streamList.forEach(stream -> {
            stream.forEach(System.out::print);
            System.out.println();
        });
    }
}
