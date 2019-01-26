import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.lang.Integer;

/**
 * @author: 颜伟晗
 * @date: 2018/12/31
 * @Description:
 */
@Data
public class Apple {

    public String name;
    public Integer weight;

    public Apple() {
    }

    public Apple(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
