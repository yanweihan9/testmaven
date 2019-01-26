package OptionalTest;

import org.junit.Test;

import java.util.Optional;

/**
 * @author: 颜伟晗
 * @date: 2019/1/6
 * @Description:
 */
public class OptionalUsage {
   /* public static void main(String[] args) {
        Optional<Insurance> insuranceOptional0 = Optional.<Insurance>empty();
        Optional<Insurance> insuranceOptional1 = Optional.of(new Insurance());
        Optional<Insurance> insuranceOptional2 = Optional.ofNullable(null);
       *//* insuranceOptional2.get();
        insuranceOptional2.orElse(new Insurance());
        insuranceOptional2.orElseGet(Insurance::new);
        insuranceOptional2.orElseThrow(RuntimeException::new);
        insuranceOptional2.orElseThrow(() -> new RuntimeException("Not have reference"));*//*

        //insuranceOptional1.filter(t -> t.getName() != null).get();
       *//* Optional<String> stringOptional = insuranceOptional1.map(Insurance::getName);
        System.out.println(stringOptional.orElse("empty Value"));

        //判断是否有值,有值输入true,否则false
        System.out.println(stringOptional.isPresent());
        //有值打印出来
        stringOptional.ifPresent(System.out::println);*//*

    }*/

    /*private String method1(Insurance insurance) {
        if (insurance == null) {
            return "empty Value";
        }
        return insurance.getName();
    }

    private String method2(Insurance insurance) {
        return Optional.ofNullable(insurance).map(Insurance::getName).orElse("empty Value");
    }*/

    @Test
    public void test() {
        Insurance fee = new Insurance("fee");
        Car car = new Car(Optional.ofNullable(fee));
        Person person = new Person(Optional.ofNullable(car));
        String s = Optional.ofNullable(getName(person)).get();

    }

    private String getName(Person person) {
        return Optional.ofNullable(person).flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("不存在");
    }
}
