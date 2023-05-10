package kr.ac.kopo.day15.inter;

public class LGTV implements TV {

    private boolean power;
    private int channerlNo;
    private int volumeSize;

    boolean muteFlag = false;
    int tempVolumeSize;

    public LGTV() {
        power = false;
        channerlNo = 10;
        volumeSize = 7;
        System.out.println("LGTV를 구매했습니다.");
    }

    @Override
    public void powerOn() {
        power = true;
        System.out.println("TV 전원을 켭니다.");
        info();
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("TV 전원을 끕니다.");
    }

    @Override
    public void channelUp() {
        channerlNo++;
        System.out.println("채널 UP을 선택했습니다.");
        info();
    }

    @Override
    public void channerDown() {
        channerlNo--;
        System.out.println("채널 DOWN을 선택했습니다.");
        info();

    }

    @Override
    public void volumeUp() {
        if (TV.MAX_VOLUME_SIZE > volumeSize)
            volumeSize++;
        System.out.println("볼륨 UP 을 선택했습니다.");
        info();
    }

    @Override
    public void volumeDown() {
        if (MIN_VOLUME_SIZE < volumeSize)
            volumeSize--;
        System.out.println("볼륨 DOWM 을 선택했습니다.");
        info();

    }

    @Override
    public void mute() {
        if (!muteFlag) {
            tempVolumeSize = volumeSize;
            volumeSize = TV.MIN_VOLUME_SIZE;
            System.out.println("음소거 중입니다.");
        } else {
            volumeSize = tempVolumeSize;
            System.out.println("음소거 해제합니다.");
        }

        muteFlag = !muteFlag;

        info();
    }

    public void info() {
        System.out.println("채널번호 : " + channerlNo + ", 음량크기 : " + volumeSize);
    }

}
