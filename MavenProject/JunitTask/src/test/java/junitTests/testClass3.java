package junitTests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

public class testClass3 {

    @ParameterizedTest ()
    @CsvSource(value = {"duaa:01:house-4","natasha:02:house-5"},delimiter = ':')

    void getData(String name, int id, String address){
        System.out.println("name = " + name + ", id = " + id + ", address = " + address);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/params/studentsdata.csv", numLinesToSkip = 1)
    @DisplayName("CSVFileSourceTest")

    void getPersonData(String name, int id, String cnic, String num){
        System.out.println("name = " + name + ", id = " + id + ", cnic = " + cnic + ", num = " + num);

    }
    @ParameterizedTest()
    @MethodSource(value = "junitTests.testClass4#personData")
    void getPersonsData(String name, int id, String adr){
        System.out.println("name = " + name + ", id = " + id + ", adr = " + adr);

    }

}
