import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author: 颜伟晗
 * @date: 2019/1/3
 * @Description:
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
      /*  ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("ywh").build();
        ThreadPoolExecutor threadPoolExecutor =
                        new ThreadPoolExecutor(3,
                        3, 0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>(),
                        threadFactory,
                        new ThreadPoolExecutor.AbortPolicy());
        //ExecutorService executorService = Executors.newFixedThreadPool(3);*/
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int index = i;
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(() -> {
                System.out.println(index);

            });
        }
        //关闭线程池
        executorService.shutdown();
       // executorService.awaitTermination();
       // executorService.shutdownNow();
    }
}
