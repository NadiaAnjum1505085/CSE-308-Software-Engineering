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

    public int getproductamount(int c)
    {
      return   products[c].GetproductNumber();

    }
    public int getproductprice(int c)
    {
        return   products[c].getPrice();

    }
    public int getBalance()
    {
        return balance;
    }
    public void getproduct(int c)
    {
        products[c].getProduct();
        balance=balance+products[c].getPrice();
    }
    public void Setstate(State state)
    {
        this.state=state;



    }
}
