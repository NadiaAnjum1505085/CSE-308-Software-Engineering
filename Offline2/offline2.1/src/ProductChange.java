public class ProductChange implements State {
    @Override
    public void DoAction(VendingMachine vendingmachine) {
        System.out.println("Your chosen product is    and change 5.00");
        vendingmachine.Setstate(this);
    }
}
