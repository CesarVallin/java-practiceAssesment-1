public class Vehicle implements VehicleStorage {

    /** Instance properties */
    private String manufacturer;
    private String model;

    private int cargoCapacity;
    private int modelYear;

    /** Constructor */
    public Vehicle (String manufacturer, String model, int cargoCapacity, int modelYear) {
        if(manufacturer == null || model == null || cargoCapacity == 0 || modelYear == 0) {
            throw new IllegalArgumentException("Please check entry fields, no null or 0 values");
        }
        this.manufacturer = manufacturer;
        this.model = model;
        this.cargoCapacity = cargoCapacity;
        this.modelYear = modelYear;
    }

    /** Getters and setters */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public String storeStuff(String stuff) {
        String adjective = null;
        if (this.getCargoCapacity() < 20) {
            adjective = "measly";
        }
        if (this.getCargoCapacity() > 20) {
            adjective = "whopping";
        }
        return "The " + this.getManufacturer() + " " + this.getModel() + " can store a " + adjective + " " + this.getCargoCapacity() + " units of " + stuff + ".";
    }
}
