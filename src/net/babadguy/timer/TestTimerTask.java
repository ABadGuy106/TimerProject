package net.babadguy.timer;

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
        //打印当前name的内容
        System.out.println("Current exec name is:"+name);
    }
}
