public class SneakersBar implements VendingProducts {
    int p=65;
    String s="Sneakers";
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
