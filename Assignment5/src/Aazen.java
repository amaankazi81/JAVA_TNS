
public class Aazen extends TaxPayer {

    public Aazen(double salary) {
        super(salary);
    }

    public double calculateTax() {
        if (salary <= 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.20;
        }
    }
}
