public class getFactory {
    private static coffeeFactory coff=new coffeeFactory();
    private getFactory()
    {

    }
    public static coffeeFactory coffee()
    {
        return coff;
    }

}
