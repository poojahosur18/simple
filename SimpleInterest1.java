
public class SimpleInterest1 {
    public static void main(String[] args) {
        double principal = 5000;
        double rate = 5;
        double time = 2;

        double interest = (principal * rate * time) / 100;

        System.out.println("=== Simple Interest 1 ===");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + interest);
    }
}
