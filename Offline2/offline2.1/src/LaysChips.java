public class LaysChips implements VendingProducts {
    int p=25;
    String s="Lays Chips";
    int number=50;

    @Override
    public int getPrice() {
        return p;
    }

    @Override
    public String getName() {
        return s;
    }

    @Override
    public int GetproductNumber() {
        return number;
    }

    @Override
    public void getProduct() {
       number--;
    }
}
