package javastream.lect;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Lect04 {
    @Test
    public void distinct() throws Exception{
      //tekilleştirme (removing duplicates in a List)
        final List<Integer> numbers=ImmutableList.of(1,1,1,2,2,2,3,3,5,5,5,5,8,8,8,8,13,13,13,13,21,21,21,34,55,55,89,89,144);
        numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }
    @Test
    public void a(){
        int x=1;
        for (int i = 0;i <9 ; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                x+=3;
            }
        }
        System.out.println(x);
    }
}
