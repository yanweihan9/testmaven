/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

*/
/**
 * @author: 颜伟晗
 * @date: 2018/12/31
 * @Description:
 *//*

public class FilterApple {

    @FunctionalInterface
    public interface AppleFilter {
        boolean filter(Apple apple);
    }

    public static List<Apple> findApple(List<Apple> apples, AppleFilter appleFilter) {
        ArrayList<Apple> list = new ArrayList<>();
        for (Apple apple : apples) {
            if (appleFilter.filter(apple)) {
                list.add(apple);
            }
        }
        return list;

    }

    public static List<Apple> findGreenApple(List<Apple> apples) {
        List<Apple> appleList = new ArrayList<>();
        for (Apple apple : apples) {
            if ("苹果".equals(apple.getName())) {
                appleList.add(apple);
            }
        }
        return appleList;

    }

    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(new Apple("苹果", 12), new Apple("桃子", 11));
        //List<Apple> greenApple = findGreenApple(appleList);
        //System.out.println(greenApple);
//        List<Apple> apples = findApple(appleList, new AppleFilter() {
//            @Override
//            public boolean filter(Apple apple) {
//                if (apple.getName().equals("苹果") && apple.getWeight() == 12) {
//                    return true;
//                }
//                return false;
//            }
//        });
        List<Apple> apples = findApple(appleList, apple -> {
            return "苹果".equals(apple.getName());
        });
        System.out.println(apples);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();
    }

}
*/
