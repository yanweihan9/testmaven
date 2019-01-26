/**
 * @author: 颜伟晗
 * @date: 2019/1/1
 * @Description:
 */
@FunctionalInterface
public interface DefineReference<T,U,R> {

    R apply(T t,U u);

}
