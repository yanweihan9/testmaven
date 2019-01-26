import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;


import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @author: 颜伟晗
 * @date: 2019/1/8
 * @Description:
 */
public class CollectorIntroduce {

    @Test
    public void test() {
        List<Apple> appleList = Arrays.asList(
                new Apple("a", 11),
                new Apple("a", 12),
                new Apple("c", 13),
                new Apple("c", 14),
                new Apple("e", 25));
        Set<String> collect = appleList.stream().map(Apple::getName).collect(toSet());
        System.out.println(collect);
    }

    private Map<String, List<Apple>> getMap(List<Apple> apples) {
        Map<String, List<Apple>> map = Maps.newHashMap();
        for (Apple apple : apples) {
            List<Apple> appleList = map.get(apple.getName());
            if (appleList == null) {
                appleList = Lists.newArrayList();
                map.put(apple.getName(), appleList);
            }
            appleList.add(apple);
        }
        return map;
    }

    private Map<String, List<Apple>> getMapLambda(List<Apple> apples) {
        Map<String, List<Apple>> map = Maps.newHashMap();
        apples.stream().forEach(apple -> {
            List<Apple> appleList = Optional.ofNullable(map.get(apple.getName())).orElseGet(() -> {
                List<Apple> list = Lists.newArrayList();
                map.put(apple.getName(), list);
                return list;
            });
            appleList.add(apple);
        });
        return map;
    }

    private Map<String, List<Apple>> getMapCollector(List<Apple> apples) {
        return apples.stream().collect(groupingBy(Apple::getName));
    }

    /*private Double getWeightAvg(List<Apple> apples) {
        return apples.stream().collect(Collectors.averagingDouble(Apple::getWeight));
    }*/

   /* private String getStringWeightAvg(List<Apple> apples) {
        //将返回的Double类型的平均数值转化成String类型
        return apples.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.averagingDouble(Apple::getWeight),
                        //第二个参数表示,拿到第一个参数执行的返回值再做方法操作
                        avg -> "平均数:" + avg)
        );
    }*/
}
