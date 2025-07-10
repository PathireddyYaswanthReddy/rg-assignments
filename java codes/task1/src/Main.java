public class Main {
    public static void main(String[] args) {
        TaxUtil obj = new TaxUtil();

        double tax = obj.calculateTax(1000,0.15);
        System.out.println(tax);
    }
}