public class insufficientChange implements State {
    @Override
    public void DoAction(VendingMachine vendingmachine) {
        System.out.println("We are extremely sorry that we don't have enough change.");
        vendingmachine.Setstate(this);
    }
}
