public class Dew implements VendingProducts {
    int p=30;
    String s="Mountain Dew";
    int number=1;

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
