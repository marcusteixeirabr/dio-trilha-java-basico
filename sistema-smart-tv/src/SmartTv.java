public class SmartTv {

    boolean on = false;
    short channel = 1;
    byte volume = 25;

    public void increaseVolume() {
        volume++;
        System.out.println("Aumentando o volume para " + volume);

    }

    public void increaseChannel() {
        channel++;
        System.out.println();
    }

    public void decreaseChannel() {
        channel--;
    }

    public void changeChannel(short newChannel) {
        channel = newChannel;
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }
    

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

}
