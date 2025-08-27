package taxes;

public class TaxFifteen extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) ((debit - credit) * 0.15);
        if (tax < 0) {
            return 0;
        } else {
            return tax;
        }
    }
}
