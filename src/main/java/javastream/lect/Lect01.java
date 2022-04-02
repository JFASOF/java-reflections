package javastream.lect;

import com.google.common.collect.Lists;
import javastream.domain.Person;
import javastream.mockData.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Lect01 {
    //Zorunlu Yaklaşım-imperativeApproach
    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> listOfYoungPeople = Lists.newArrayList();
        final Integer limit = 10;
        Integer counter = 0;
        for (Person person : people) {
            if (person.getAge() <= 18) {
                listOfYoungPeople.add(person);
                counter++;
                if (counter == limit)
                    break;
            }
        }
        for (Person youngPerson : listOfYoungPeople) {
            System.out.println(youngPerson);
        }

    }

    //Bildirimsel-Fonksiyonel Yaklaşım-declarative-functional Approach
    @Test
    public void declarativeFunctionalApproachUsingStreams() throws IOException {
        List<Person> people = MockData.getPeople();
        //Concrete (listOfYoungPeople(Lists,Sets,Maps,Arrays)-->Abstraction(filter,limit,reduce,map,etc.)-->Concrete(Collection.toList())
        List<Person> listOfYoungPeople = people.stream()
                //Yaş Filtreleme
                .filter(person -> person.getAge() <= 18)
                //İlk 10 kişi
                .limit(10)
                //Filtrelenleri Toplama ve Listeye Atama
                .collect(Collectors.toList());
        listOfYoungPeople.forEach(System.out::println);

        //Gradle - Maven

        //Bir diğer daraltılmış yazım ise şu şekildedir:
        MockData.getPeople().stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
