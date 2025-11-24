public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        InteresCalculator interesCalculator= new InteresCalculator();
        System.out.println(""+interesCalculator.monthlyPayment(70000,4, 5));
        System.out.println(""+interesCalculator.calculateCompound(400000, 4, 3));
    }
}
