package com.chenqx.old;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author cqx
 * @date 2018/4/23 15:49
 */
public class StreamReduce {
    public static void main(String[] args) {
        Stream<Integer> stream;
        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        stream.reduce((i, j) -> i < j ? j : i).ifPresent(System.out::println);

        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        //int result2 = stream.filter(i -> i % 2 == 0).reduce(1, (i, j) -> i * j);
        int result2 = stream.filter(i -> i % 2 == 0).reduce(0,(i,j)->i+j);
        System.out.println(result2);

    }

}
