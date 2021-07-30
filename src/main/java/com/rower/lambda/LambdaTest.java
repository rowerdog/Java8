package com.rower.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @ClassName: LambdaTest
 * @Description
 * @Author gengmb on 2021/7/30 9:46
 * @Version: 1.0
 */
public class LambdaTest {

    /**
     * 无参，无返回值
     */
    @Test
    public void test(){
        Runnable r1= ()-> System.out.println("你好");
        r1.run();
        Thread t1 = new Thread(r1);
        t1.run();
    }

    /**
     *
     * 有一个参数，无返回值
     */
    @Test
    public void test1(){
        Consumer<String> con = s-> System.out.println(s);
        con.accept("无语");
    }

    /**
     * 两个参数，并且方法体内多条语句
     */
    @Test
    public void test2(){
        Comparator<Integer> com1 = (a, b)->{
            System.out.println("比较a和b的大小");
            return a.compareTo(b);
        };
        System.out.println(com1.compare(1, 2));
    }

    @Test
    public void test3(){
        Thread t1 = new Thread();
        t1.start();
    }
}
