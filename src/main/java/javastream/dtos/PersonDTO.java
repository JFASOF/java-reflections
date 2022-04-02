package javastream.dtos;

import javastream.domain.Person;
import lombok.Data;

@Data
public class PersonDTO {
    final String firstName;
    final String lastName;
    final String email;
    final String gender;
    final Integer age;
    @Override
    public String toString() {
        return "PeopleDTO{" +
                "firstName=" + firstName +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
    public static PersonDTO map(Person person){
        return new PersonDTO(person.getFirstName(), person.getLastName(), person.getEmail(), person.getGender(),person.getAge());
    }
}
