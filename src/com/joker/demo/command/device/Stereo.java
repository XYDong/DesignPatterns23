package com.joker.demo.command.device;

/**
 * @version 1.0.0
 * @ClassName Stereo.java
 * @Package com.joker.demo.construction.device
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 13:52:00
 */
public class Stereo {

    static int volume = 0;

    public void on(){
        System.out.println("Stereo On");
    }
    public void off(){
        System.out.println("Stereo Off");
    }

    public void setCd(){
        System.out.println("Stereo SetCD");
    }

    public void setVolume(int vol){
        volume = vol;
        System.out.println("Stereo volume=" + vol);
    }

    public static int getVolume() {
        return volume;
    }
    public void start(){
        System.out.println("Stereo start");
    }
}
