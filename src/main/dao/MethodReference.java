/*
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

*/
/**
 * @author: 颜伟晗
 * @date: 2019/1/1
 * @Description:
 *//*

public class MethodReference {
    public static void main(String[] args) {
        //类变量的方法推导(类的成员方法)
        BiFunction<String, Integer, Character> function1 = String::charAt;
        Character result = function1.apply("abc", 2);
        System.out.println(result);

        //实例变量的方法推导(实例方法)
        String abc = new String("abc");
        Function<Integer, Character> function2 = abc::charAt;
        Character result2 = function2.apply(2);
        System.out.println(result2);


        DefineReference<String, Integer, Apple> defineReference = Apple::new;
        DefineReference<String, Integer, Apple> defineReference2 = (t, u) -> new Apple(t, u);
        System.out.println(defineReference2.apply("xxx", 223));

       */
/* List<Apple> list = Arrays.asList(
                new Apple("苹果", 12),
                new Apple("桃子", 11),
                new Apple("香蕉", 14),
                new Apple("葡萄", 15),
                new Apple("葡萄", 12));

        list.sort(Comparator.comparing(Apple::getWeight));*//*



        //List<String> stringList = Lists.transform(list, Apple::getName);
        //List<String> collect = list.stream().map(Apple::getName).collect(toList());
        // collect.add("ll");
        //stringList.add("nnn");
        */
/*System.out.println(collect);

        for (Apple apple : list) {
            apple.setName("xxx");
        }*//*

//        System.out.println(list);


        // Collections.sort(list, Comparator.comparing(Apple::getName).thenComparing(Apple::getWeight));
        // System.out.println(list);


        //找出重量大于11的水果,并且按照名字进行排序,只输出他们的名字
        List<String> listName = list.stream()
                .filter(apple -> apple.getWeight() > 11)
                .sorted(Comparator.comparing(Apple::getName))
                .map(Apple::getName)
                .collect(toList());
        //System.out.println(listName);

        //Collections.sort(list, Comparator.comparing(Apple::getWeight));


        //Comparator<Apple> byWeight1 = (o1, o2) -> o1.getWeight().compareTo(o2.getWeight());
        //Comparator<Apple> byWeight2 = Comparator.comparing(Apple::getWeight);


    }


}
*/
