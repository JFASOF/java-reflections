package javastream.lect;

import javastream.domain.Person;
import javastream.mockData.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class Lect02 {
    @Test
    public void range() throws Exception {
        for (Integer i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //Functional Programming-Functional Approach
        //Exclusive-->Son index dışlanır
        System.out.println("Exclusive");
        IntStream.range(0, 10)
                .forEach(System.out::println);
        System.out.println("Inclusive");
        IntStream.rangeClosed(0, 10)
                .forEach(System.out::println);
    }

    @Test
    public void rangeIteratingLists() throws Exception {
        List<Person> personList = MockData.getPeople();
        //personList akışı
        IntStream.range(0, personList.size())
                .forEach(i -> {
                    Person person = personList.get(i);
                    System.out.println(person);
                });


    }

    @Test
    public void intStreamIterate() throws Exception {
        //seed-->başlangıç yeri
        //intUnaryOperator-->Tekli Operatör geçişini sağlamak bu yapı bir fonksiyondur ve artırımı nasıl sağlayacağını yönetir.
        IntStream.iterate(0, operand -> operand + 1)
                //çift sayıları görmek istersek
                .filter(n -> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);
        //limit olmaz ise sonsuza gider.

    }
}
