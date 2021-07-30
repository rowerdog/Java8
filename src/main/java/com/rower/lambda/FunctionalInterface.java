package com.rower.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ClassName: FunctionalInterface
 * @Description
 * @Author gengmb on 2021/7/30 9:50
 * @Version: 1.0
 */
public class FunctionalInterface {


    @Test
    public void test1(){
        Comparator<Integer> com = Integer::compareTo;
        System.out.println(com.compare(1, 2));
    }

}
