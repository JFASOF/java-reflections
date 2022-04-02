package javastream.domain;

import lombok.Data;

@Data
public class Person {
    final Integer id;
    final String firstName;
    final String lastName;
    final String email;
    final String gender;
    final Integer age;
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
