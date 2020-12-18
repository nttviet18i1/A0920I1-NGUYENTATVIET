package acess_modifer.Thuchanh;

public class car {

    private String name;

    private String engine;



    public static int numberOfCars;



    public car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }



    // getters and setters

}