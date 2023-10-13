package junitTests;

import org.junit.jupiter.params.provider.Arguments;


import java.util.stream.Stream;

public class testClass4 {

    static Stream<Arguments> personData(){

        return Stream.of(Arguments.arguments("Duaa", 001, "House-4"), Arguments.arguments("natasha", 001, "House-5"));

    }
}
