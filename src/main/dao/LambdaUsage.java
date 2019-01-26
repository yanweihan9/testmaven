/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;

*/
/**
 * @author: 颜伟晗
 * @date: 2019/1/1
 * @Description:
 *//*

public class LambdaUsage {

    public static List<Apple> filter(List<Apple> appleList, Predicate<Apple> predicate) {
        List<Apple> appleNewList = new ArrayList<>();
        for (Apple apple : appleList) {
            if (predicate.test(apple)) {
                appleNewList.add(apple);
            }
        }
        return appleNewList;
    }

    public static void filter2(List<Apple> appleList, Consumer<Apple> consumer) {
        for (Apple apple : appleList) {
            consumer.accept(apple);
        }
    }

    public static String filter3(Apple apple, Function<Apple, String> function) {
        return function.apply(apple);
    }

    public static Apple filter4(String name, Integer weight, BiFunction<String, Integer, Apple> biFunction) {
        return biFunction.apply(name, weight);
    }

    public static Apple filter5(Supplier<Apple> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        Apple apple = filter5(() -> new Apple("山竹",22));
        System.out.println(apple);
    }


}
*/
