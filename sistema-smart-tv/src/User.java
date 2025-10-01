public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("Estado da TV: ".concat(smartTv.on ? "ligada" : "desligada"));
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.changeChannel((short) 13);
        System.out.println("Novo canal: " + smartTv.channel);

        smartTv.turnOn();
        System.out.println("Novo estado da TV: ".concat(smartTv.on ? "ligada" : "desligada"));
        
        smartTv.turnOff();
        System.out.println("Novo estado da TV: ".concat(smartTv.on ? "ligada" : "desligada"));
    }

}
