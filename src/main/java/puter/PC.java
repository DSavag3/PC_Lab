package puter;

public class PC {

    Case pcCase;
    MotherBoard motherboard;
    Monitor monitor;

    public PC (Case pcCase,MotherBoard motherboard,Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;

    }

    private void drawLogo() {

        monitor.drawPixel(10,10,"Purple");
    }
    public void description(){
        System.out.println("Welcome to the worst buy below is the description of the pc on sale today"  + pcCase + "," + motherboard + monitor);

    }

    @Override
    public String toString() {
        return "PC{" +
                "pcCase=" + pcCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
    public void powerUp(){
        pcCase.pressPowerButton();
        this.drawLogo();
        motherboard.loadProgram("Photoshop");


    }
}
