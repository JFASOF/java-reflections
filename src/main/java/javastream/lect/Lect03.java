package javastream.lect;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Lect03 {
    @Test
    public void min() throws Exception {
        final List<Integer> numbers=ImmutableList.of(1,2,3,5,8,13,21,34,55,89,144);
        //Comparator<Integer> comparator= Integer::compare;
        Integer min = numbers.stream()
                //Comparator 2 argüman alır. Yani 2 sayıyı bekler.
                //İsteğe bağlı değer döndürülür.
                .min((n1, n2) -> n1 < n2 ? 1 : -1)
                .get();
        //durumu şart koşma , iddia etma (assert that)
        assert(min.equals(1));
        System.out.println(min);
        //assertThat(min).isEqualTo(1);
        //Liste içerisindeki bu sayı en minimumdur.
        

    }
    @Test
    public void min2() throws Exception {
        Random rand=new Random();
        final List<Integer> integerList= rand.ints(5,1,10)
                .boxed()
                .collect(Collectors.toList());
        ImmutableList.of(integerList);
        Integer min = integerList.stream()
                .min((n1, n2) -> n1 < n2 ? 1 : -1)
                .get();
        assert(min.equals(1));
        System.out.println(min);
    }

    @Test
    public void max() throws Exception{
        final List<Integer> numbers=ImmutableList.of(1,2,3,5,8,13,21,34,55,89,144);

    }
}
