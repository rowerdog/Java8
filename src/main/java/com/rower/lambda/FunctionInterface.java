package com.rower.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: FunctionInterface
 * @Description
 * @Author gengmb on 2021/7/30 10:03
 * @Version: 1.0
 */
public class FunctionInterface {
    /**
     * FunctionInterface对应的实现类
     * 可以是接口的实现类
     * Lambda表达式
     * 还可以符合方法签名的静态方法
     * 符合方法签名的构造方法
     * 符合方法签名的实例方法
     * 只看方法参数和返回值，不看继承关系
     * @param args
     */

    public static void main(String[] args) {
        String[] arr = new String[]{"apple","banna","watermelon","orange"};
        Arrays.sort(arr,FunctionInterface::cmp);
        System.out.println(String.join(",",arr));

        //符合方法签名的实例方法
        Arrays.sort(arr,String::compareTo);

        List<String> names = Arrays.asList("bob","shadow","what");
        //符合方法签名的构造方法
        List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons);
    }

    /**
     * 还可以符合方法签名的静态方法
     * @param str1
     * @param str2
     * @return
     */
    static int cmp(String str1,String str2){
        return str1.compareTo(str2);
    }
}
class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}