package net.babadguy.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class TestTimer {
    public static void main(String[] args){
        //创建一个timer实例
        Timer timer=new Timer();
        //创建一个TestTimerTask实例
        TestTimerTask testTimerTask=new TestTimerTask("No.1");
        //通过timer定时定评论调用testTimerTask的业务逻辑
        //即第一次执行是再当前时间的两秒之后，只会每隔一秒执行一次
        //timer.schedule(testTimerTask,2000,1000);

        /**
         * 获取当前时间，并设置成距离当前时间前三秒之后的时间
         * 如果当前时间是2018-11-10 23：59：57
         * 则设置后的时间则为2018-11-11 00：00：00
         */
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        calendar.add(Calendar.SECOND,3);
        /**
         * 在时间等于或超过time的时候执行且仅执行一次task
         */
//        testTimerTask.setName("schedule1");
//        timer.schedule(testTimerTask,calendar.getTime());
        /**
         * 在时间等于或超过time的时候首次执行task,之后每隔period毫秒执行一个task
         */
//        testTimerTask.setName("schedule2");
//        timer.schedule(testTimerTask,calendar.getTime(),2000);
        /**
         * 等待delay毫秒后执行且仅执行一次task
         */
//            testTimerTask.setName("schedule3");
//            timer.schedule(testTimerTask,1000);
        /**
         * 等待delay毫秒后首次执行task,之后每隔period毫秒执行一个task
          */
        testTimerTask.setName("schedule4");
        timer.schedule(testTimerTask,3000,2000);

    }
}
