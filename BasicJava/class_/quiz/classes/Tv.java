package class_.quiz.classes;

public class Tv {
    private int channel;
    private int prevChannel;
    private int volume;
    private boolean isPowerOn;

    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_CHANNEL = 300;
    private final int MIN_CHANNEL = 1;

    public Tv() {
        this.channel = 7;
        this.volume = 20;
    }

    public int getChannel() {
        return channel;
    }

    public int getPrevChannel() {
        return prevChannel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void powerOnOff() {
        isPowerOn = !isPowerOn;
    }

    public void volumeUp() {
        if (isPowerOn == true && this.volume <= MAX_VOLUME) {
            this.volume++;
            System.out.println(volume);
        }

        else {
            System.out.println("최대 음향 입니다.");
        }
    }

    public void volumeDown() {
        if (isPowerOn == true && this.volume >= MIN_VOLUME) {
            this.volume--;
            System.out.println(volume);
        }

        else {
            System.out.println("최소 음향 입니다.");
        }
    }

    public void channelUp() {
        if (isPowerOn == true && this.channel <= MAX_CHANNEL) {
            prevChannel = channel;
            this.channel++;
            System.out.println("바뀐 채널: " + channel);

        }

        else {
            System.out.println("최대 채널 도달");
        }
    }

    public void channelDown() {
        if (isPowerOn == true && this.channel >= MIN_CHANNEL) {
            prevChannel = channel;
            this.channel--;
            System.out.println(channel);

        }

        else {
            System.out.println("최소 채널 도달");
        }
    }

    public boolean moveChannel(int i) {
        if (isPowerOn == true && i >= MIN_CHANNEL && i <= MAX_CHANNEL) {
            prevChannel = channel;
            this.channel = i;
            System.out.printf("%d번 채널로 이동 완료\n", this.channel);
            return true;
        }

        else
            return false;
    }

    public void prevChannel() {
        if (!isPowerOn) {
            System.out.println("전원이 꺼져 있습니다,");
            return;
        }

        else if (prevChannel == 0) {
            System.out.println("이전 채널 없음");
            return;
        }

        int temp = channel;
        channel = prevChannel;
        prevChannel = temp;

    }

    public void getTvInfo() {
        System.out.println("--- TV 상태 정보 ---");
        System.out.println("전원: " + this.isPowerOn);
        System.out.println("채널: " + this.channel);
        System.out.println("볼륨: " + this.volume);
        System.out.println("이전 채널: " + this.prevChannel + "\n");
    }
}
