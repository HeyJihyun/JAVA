package kr.ac.kopo.day15.inter;

public interface TV {

    /* public static final */int MAX_VOLUME_SIZE = 50;
    int MIN_VOLUME_SIZE = 0;

    /* public abstract */void powerOn();

    void powerOff();

    void channelUp();

    void channerDown();

    void volumeUp();

    void volumeDown();

    void mute();

}
