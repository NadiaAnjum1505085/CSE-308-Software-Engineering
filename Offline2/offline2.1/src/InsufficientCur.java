public class InsufficientCur implements State {
    @Override
    public void DoAction(VendingMachine vendingmachine) {
        System.out.println("Not enough money");
        vendingmachine.Setstate(this);
    }
}
