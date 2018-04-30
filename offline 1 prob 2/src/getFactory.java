public class getFactory {
    private static coffeeFactory coff=new coffeeFactory();
    private getFactory()
    {

    }
    private static coffeeFactory coffee()
    {
        return coff;
    }

}
