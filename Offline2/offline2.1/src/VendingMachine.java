public class VendingMachine {
    private State state;
    private int balance;
    private VendingProducts products[];
    VendingMachine(int b)
    {
        balance=b;
        state=null;
        products=new VendingProducts[3];
        products[0]=new LaysChips();
        products[1]=new SneakersBar();
        products[2]=new Dew();

    }

    public void Setstate(State state)
    {
        this.state=state;



    }
}
