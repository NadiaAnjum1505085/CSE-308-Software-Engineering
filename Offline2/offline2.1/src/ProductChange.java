public class ProductChange implements State {
    @Override
    public void DoAction(VendingMachine vendingmachine) {
        System.out.print("You will receive the product shortly and change ");
        vendingmachine.Setstate(this);
    }
}
