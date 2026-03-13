package Assignment2;
public class GarbageCollection {

    public static void main(String[] args) {

        GarbageCollection obj = new GarbageCollection();

        obj = null; // Object eligible for GC

        System.gc();

        System.out.println("End of main");
    }
}