package net.babadguy.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class TestTimerTask extends TimerTask {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestTimerTask(String inputName){
        this.name=inputName;
    }

    @Override
    public void run() {
        //以yyyy-MM-dd HH:mm:ss的格式打印当前执行时间
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.print("Current exec time is:"+sf.format(calendar.getTime()));
        //打印当前name的内容
        System.out.println("Current exec name is:"+name);
    }
}
