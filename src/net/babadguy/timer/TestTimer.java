package net.babadguy.timer;

import java.util.Timer;

public class TestTimer {
    public static void main(String[] args){
        //创建一个timer实例
        Timer timer=new Timer();
        //创建一个TestTimerTask实例
        TestTimerTask testTimerTask=new TestTimerTask("No.1");
        //通过timer定时定评论调用testTimerTask的业务逻辑
        //即第一次执行是再当前时间的两秒之后，只会每隔一秒执行一次
        timer.schedule(testTimerTask,2000,1000);
    }
}
