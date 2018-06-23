public class ProductnoChange implements State {
    @Override
    public void DoAction(VendingMachine vendingmachine) {
        System.out.println("Your chosen product is    and change 0.00");
        vendingmachine.Setstate(this);

    }

}
