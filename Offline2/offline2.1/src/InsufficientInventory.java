public class InsufficientInventory implements State {
    @Override
    public void DoAction(VendingMachine vendingmachine) {
        System.out.println("We are extremely sorry, there is no product in our inventory");
        vendingmachine.Setstate(this);
    }
}
