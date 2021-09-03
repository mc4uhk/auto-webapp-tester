package hk.mc4u.webtester.test;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test12 {

    @Test
    public void testStopWatch() throws InterruptedException {
        StopWatch watch = StopWatch.createStarted(); //创建后立即start，常用
        //StopWatch watch = new StopWatch();
        //watch.start();

        Thread.sleep(1000);
        log.info("统计从开始到现在运行时间：" + watch.getTime() + "ms"); //1000ms

        Thread.sleep(1000);
        watch.split();
        log.info("从start到此刻为止的时间：" + watch.getTime());
        log.info("从开始到第1个切入点运行时间：{} {}",  watch.getSplitTime(), watch.toSplitString()); //2245

        Thread.sleep(1000);
        watch.split();
        log.info("从开始到第2个切入点运行时间：{} {}",  watch.getSplitTime(), watch.toSplitString()); //2245

        Thread.sleep(1000);
        watch.split();
        log.info("从开始到第3个切入点运行时间：{} {}",  watch.getSplitTime(), watch.toSplitString()); //2245

        
        watch.reset(); //重置后必须使用start方法
        watch.start();
        Thread.sleep(1000);
        log.info("重新开始后到当前运行时间是：" + watch.getTime()); //1000

        watch.suspend(); //暂停
        Thread.sleep(6000); //模拟暂停6秒钟

        watch.resume(); //上面suspend，这里要想重新统计，需要恢复一下
        log.info("恢复后执行的时间是：" + watch.getTime()); //1000  注意此时这个值还是1000

        watch.stop();
        log.info("花费的时间》》" + watch.getTime() + "ms"); //1002ms
        log.info("花费的时间》》" + watch.getTime(TimeUnit.SECONDS) + "s"); //1s 可以直接转成s

    } 
}
