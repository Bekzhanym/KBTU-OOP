public class Car extends Vehicle {

    private String licensePlate;

    public Car(String brand, String model, String licensePlate) {
        super(brand, model);
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car[brand='" + getBrand() + "', model='" + getModel() + "', plate='" + licensePlate + "']";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return licensePlate != null ? licensePlate.equals(car.licensePlate) : car.licensePlate == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (licensePlate != null ? licensePlate.hashCode() : 0);
        return result;
    }
}
