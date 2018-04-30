public class chicken implements burgerItem {

    @Override
    public String Name() {
        return "chicken burger";
    }

    @Override
    public String Patty() {
        return "bbq";
    }

    @Override
    public String chesse() {
        return "permissian";
    }

    @Override
    public String sauce() {
        return "myo";
    }

    @Override
    public double price() {
        return 270;
    }
}

