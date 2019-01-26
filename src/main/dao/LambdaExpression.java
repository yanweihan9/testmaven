/*
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

*/
/**
 * @author: 颜伟晗
 * @date: 2019/1/1
 * @Description:
 *//*

public class LambdaExpression {
    public static void main(String[] args) {
        Comparator<Apple> appleWeight = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                if (o1.getWeight().compareTo(o2.getWeight()) < 0) {
                    return -1;
                }else {
                    return 1;
                }

            }
        };
        List<Apple> list = Collections.emptyList();
        Comparator<Apple> byWeight = Comparator.comparing(Apple::getWeight);
//        Comparator<Apple> byWeight = (o1,o2)->{
//            if (o1.getWeight().compareTo(o2.getWeight()) < 0) {
//                return -1;
//            }else {
//                return 1;
//            }
//        };
        List<Apple> appleList = Arrays.asList(
                new Apple("苹果", 12), new Apple("桃子", 11), new Apple("香蕉", 14));
        appleList.sort(byWeight);
        System.out.println(appleList);



        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(index);
//            cachedThreadPool.execute(new Runnable() {
//
//                @Override
//                public void run() {
//                    System.out.println(index);
//                }
//            });
        }


    }


}
*/
