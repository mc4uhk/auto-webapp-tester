package hk.mc4u.webtester.test;

import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;
import org.springframework.util.StopWatch.TaskInfo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test11 {

    @Test
    public void testStopWatch() throws InterruptedException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, IllegalStateException {
        // 强烈每一个秒表都给一个id，这样查看日志起来能够更加的精确
        // 至于Id 我觉得给UUID是可行的~
        StopWatch sw = new StopWatch(UUID.randomUUID().toString());

        sw.start("起床");
        Thread.sleep(1000);
        log.info("当前任务名称：" + sw.currentTaskName());
        sw.stop();

        sw.start("洗漱");
        Thread.sleep(2000);
        log.info("当前任务名称：" + sw.currentTaskName());
        sw.stop();

        sw.start("锁门");
        Thread.sleep(500);
        log.info("当前任务名称：" + sw.currentTaskName());
        sw.stop();

        log.info(sw.prettyPrint()); // 这个方法打印在我们记录日志时是非常友好的  还有百分比的分析哦
        log.info("shortSummary: {}", sw.shortSummary());
        log.info("currentTaskName: {}",sw.currentTaskName()); // stop后它的值为null


        // 最后一个任务的相关信息
        log.info(sw.getLastTaskName());
        log.info("{}",BeanUtils.describe(sw.getLastTaskInfo()) );

        // 任务总的耗时  如果你想获取到每个任务详情（包括它的任务名、耗时等等）可使用
        log.info("所有任务总耗时：" + sw.getTotalTimeMillis());
        log.info("任务总数：" + sw.getTaskCount());
        log.info("所有任务详情：" + sw.getTaskInfo()); // 拿到所有的任务
        
        for(TaskInfo task : sw.getTaskInfo()) {
        	log.info("{} {}", task.getTaskName(), task.getTimeMillis());
        }
        
    }
}
