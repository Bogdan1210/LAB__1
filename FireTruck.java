public class FireTruck {
    private int waterCapacity;

    public FireTruck(int capacity) {
        this.waterCapacity = capacity;
    }

    public void refillWater() {
        System.out.println("Заправний резервуар для води ємкість " + waterCapacity + " Галлонів.");
    }

    public void deployTruck() {
        System.out.println("Розгортання пожежного автомобіля з ємністю для води " + waterCapacity + " Галлонів.");
    }
}
