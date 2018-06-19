package com.liao.springboot;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyTest {

    @Test
    public void test1() {
        Runnable r1 = () -> System.out.print(1);
        Thread thread = new Thread(r1);
        thread.start();
    }

    @Test
    public void test2() {
        Comparator<Integer> comparator = (x, y) -> {
            System.out.print(11);
            return Integer.compare(x, y);
        };
    }

    @Test
    public void test3() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(x -> System.out.print(1));
    }

    @Test
    public void test4() {
        Person person = new Person("张三", 15, 1000d);
        Person person2 = new Person("李四", 18, 5000d);
        Person person3 = new Person("王五", 26, 200000d);
        List<Person> lists = Lists.newArrayList();
        lists.add(person);
        lists.add(person2);
        lists.add(person3);

        Stream<Person> stream = lists.stream().filter(
                (e) -> {
                    System.out.println(1111);
                    return e.getAge() > 16;
                });
        stream.forEach(System.out::println);
    }

    @Test
    public void test5() {
        Person person1 = new Person("1",1, 10d );
        Person person2 = new Person("2",2, 20d );
        Person person3 = new Person("3",3, 30d );
        List<Person> aaa = new ArrayList<>();
        aaa.add(person1);
        aaa.add(person2);
        aaa.add(person3);

        aaa.stream().filter(a -> a.getAge() > 1)
                    .forEach(System.out::print);
//        Arrays.sort();

    }

    @Test
     public void uu() {
        int a[]={1,23,4,436,547457,548};
        for(int i=0;i<a.length-1;i++) {
            int min = i;
            for(int j=i+1;j<a.length;j++) {
                if(a[j]<a[i]) {
                   min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.print(Arrays.toString(a));
    }



}
