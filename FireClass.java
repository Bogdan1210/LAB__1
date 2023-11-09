public class FireClass {
    private double fireSize;

    public FireClass(double size) {
        this.fireSize = size;
    }

    public void extinguishFire() {
        System.out.println("Гасіння пожежі розміром " + fireSize);
    }

    public double calculateExtinguishingCost(double costPerUnit) {
        return fireSize * costPerUnit;
    }

    public void reportFireStatus(boolean isEmergency) {
        if (isEmergency) {
            System.out.println("Надзвичайна ситуація! Розмір вогню: " + fireSize);
        } else {
            System.out.println("Розмір вогню: " + fireSize);
        }
    }
}

