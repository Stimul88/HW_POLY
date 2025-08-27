import taxes.TaxFifteen;
import taxes.TaxSix;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Рога и копыта", new TaxSix());
        Company company2 = new Company("Темп", new TaxFifteen());

        company1.shiftMoney(10000);
        company1.shiftMoney(-2000);
        company1.payTaxes();

        company2.shiftMoney(2000);
        company2.shiftMoney(-10000);
        company2.payTaxes();

        company2.setTax(new TaxSix());
        company2.shiftMoney(6000000);
        company2.shiftMoney(-123012);
        company2.payTaxes();
    }
}
