package Ch08.sec05;

import Ch08.sec05.RemoteControl;

public class Television implements Ch08.sec05.RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    @Override
    public void setVolume(int volume) {
        if(volume > Ch08.sec05.RemoteControl.MAX_VOLUME) {
            this.volume = Ch08.sec05.RemoteControl.MAX_VOLUME;
        } else if (volume < Ch08.sec05.RemoteControl.MIN_VOLUME) {
            this.volume = Ch08.sec05.RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + volume);
    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if(mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
