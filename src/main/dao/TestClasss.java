import org.junit.Test;

import java.util.stream.IntStream;

public class TestClasss {
    /*public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3);
        List<Integer> result = integerList.stream().sorted().collect(toList());
        System.out.println(result);

    }

    private static void print() {
        System.out.println("LL");
        System.out.println("ss");
    }*/

    public static void main(String[] args) {
        //Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6});
        //int sum = stream.mapToInt(value -> value.intValue()).sum();
        IntStream intStream = IntStream.rangeClosed(0, 100);
        int a = 9;
        intStream.filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).forEach(System.out::println);

        System.out.println();

    }

    @Test
    private void test() {

    }
}
