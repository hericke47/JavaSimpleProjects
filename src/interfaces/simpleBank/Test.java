package interfaces.simpleBank;

public class Test {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("ROI: "+b.rateOfInterest());
    }
}
