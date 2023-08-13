public class Truck extends Vehicle {

    /** Instance property*/
    protected boolean trailerHitch;

    /**
     * Constructor
     *
     * @param manufacturer
     * @param model
     * @param cargoCapacity
     * @param modelYear
     */
    public Truck(String manufacturer, String model, int cargoCapacity, int modelYear, boolean trailerHitch) {
        super(manufacturer, model, cargoCapacity, modelYear);
        this.trailerHitch = trailerHitch;
    }

    /** Instance method*/
    public boolean hasTrailerHitch() {
        return trailerHitch;
    }


}
