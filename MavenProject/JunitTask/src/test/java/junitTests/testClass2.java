package junitTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class testClass2 {

    @ParameterizedTest (name = "Run: {index} - Value: {arguments}") // to specify that we are going to use parameters

    @ValueSource(strings = {"Name","Number"}) // to specify the parameters value array

    void test1(String val){
        System.out.println("val = " + val);
    }

    @ParameterizedTest ()
    @ValueSource(ints = {123,67}) //
    void test2(int val){
        System.out.println("num = " + val);
    }


}
