import taxes.TaxSystem;

public class Company {
    public static String title;
    public static int debit;
    public static int credit;
    TaxSystem taxSystem;


    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTax(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public static void shiftMoney(int amount) {
        if(amount > 0) {
            debit = ++amount;
        } else if (amount < 0) {
            credit = Math.abs(amount);
        }
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.%n", title, tax);
    }
}
