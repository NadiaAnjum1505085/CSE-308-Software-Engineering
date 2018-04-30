public class beef implements burgerItem {
    @Override
    public String Name() {
        return "beef burger";
    }

    @Override
    public String Patty() {
        return "beef sizzling";
    }

    @Override
    public String chesse() {
        return "Mozzarella";
    }

    @Override
    public String sauce() {
        return "bbq";
    }

    @Override
    public double price() {
        return 290;
    }
}
