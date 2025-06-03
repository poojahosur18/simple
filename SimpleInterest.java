

public class SimpleInterest {

    public static double calculateInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        double principal = 8000;
        double rate = 6.5;
        double time = 4;

        double interest = calculateInterest(principal, rate, time);

        System.out.println("=== Simple Interest 2 ===");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + interest);
    }
}
