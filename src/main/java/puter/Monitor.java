package puter;

public class Monitor {

    Resolution resolution;
    long modelNumber;

    String manufacturerName;

    public void drawPixel(int x, int y, String color){


        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }




    @Override
    public String toString() {
        return "Monitor specs : " + "Resolution" + resolution + "Model number" + modelNumber + "Manufacturer name" + manufacturerName;

    }

    public Monitor(Resolution resolution, long modelNumber, String manufacturerName) {
        this.resolution = resolution;
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
    }
}
