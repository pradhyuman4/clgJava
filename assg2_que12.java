class Distance {
    private double m;

    public Distance(double m) {
        this.m = m;
    }

    public void travelTime() {
        double speedMph = 60;
        double timeHours = m / speedMph;
        System.out.printf("Time to travel %.2f miles at %.2f mph: %.2f hours%n", m, speedMph, timeHours);
    }
}


class DistanceMKS extends Distance {
    private double km;

    public DistanceMKS(double km) {
        super(km * 0.621371);
        this.km = km;
    }

    @Override
    public void travelTime() {
        double speedKps = 100;
        double timeSeconds = km / speedKps;
        System.out.printf("Time to travel %.2f kilometers at %.2f km/s: %.2f seconds%n", km, speedKps, timeSeconds);
    }
}



public class assg2_que12 {
    public static void main(String[] args) {

        Distance distanceInMiles = new Distance(120);
        distanceInMiles.travelTime();


        DistanceMKS distinKilometers = new DistanceMKS(200);
        distinKilometers.travelTime();
    }

}