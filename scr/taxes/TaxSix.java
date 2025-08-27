package taxes;

public class TaxSix extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) (debit * 0.06);
        if (tax < 0) {
            return 0;
        } else {
            return tax;
        }
    }
}
