package puter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // First create the Case, Motherboard, and Monitor that will be passed to PC constructor

        Case pcCase = new Case ("Windows xp","Microsoft","220 volts",new Dimension(200,200,100));
        MotherBoard motherBoard1 = new MotherBoard("sony23","Sony",2,4,"sony-bios");
        Monitor monitor1 = new Monitor(new Resolution(50,50),1234567890l,"HP");

        PC pc1 = new PC(pcCase,motherBoard1,monitor1);

        pc1.description();
        pc1.powerUp();
    }

}