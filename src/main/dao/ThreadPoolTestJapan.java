import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: 颜伟晗
 * @date: 2019/1/3
 * @Description:
 */
public class ThreadPoolTestJapan {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);
       // final long int =






        //关闭线程池
        pool.shutdown();
      //  pool.awaitTermination();
        pool.shutdownNow();
    }
}
