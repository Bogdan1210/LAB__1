public class Main {
    public static void main(String[] args) {
        FireClass fire = new FireClass(10.5);
        Firefighter firefighter = new Firefighter(" Джон", 5);
        FireTruck truck = new FireTruck(500);

        fire.extinguishFire();
        double extinguishingCost = fire.calculateExtinguishingCost(100);
        System.out.println("Вартість гасіння: $" + extinguishingCost);

        firefighter.rescuePeople();
        firefighter.reportStatus();

        truck.refillWater();
        truck.deployTruck();
    }
}