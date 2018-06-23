public class ProductnoChange implements State {
    @Override
    public void DoAction(VendingMachine vendingmachine) {
        System.out.println("You will receive the product shortly and change 0.00");
        vendingmachine.Setstate(this);


    }

}
