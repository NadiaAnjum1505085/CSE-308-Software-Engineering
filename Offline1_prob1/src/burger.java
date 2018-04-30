import java.util.ArrayList;
import java.util.List;

public class burger {
    private List<burgerItem> item=new ArrayList<burgerItem>();
    public void addburger(burgerItem bur)
    {
        item.add(bur);
    }
    public void show()
    {
        for(burgerItem x:item)
        {
            System.out.println(x.Name()+"-"+x.Patty()+" "+x.sauce()+" "+x.chesse()+":"+x.price());


        }
    }


}
