package OptionalTest;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

/**
 * @author: 颜伟晗
 * @date: 2019/1/6
 * @Description:
 */
@Data
@AllArgsConstructor
public class Car {
    private Optional<Insurance> insurance;
}
