import java.util.Scanner;

public class coffeeFactory {
    public Coffee getCoffee()
    {
        Coffee c=null;
        System.out.println("Which coffee do you want? : 1. coffee A, 2. coffee B (no suger), 3.coffee C");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a==1)
        {
            c=new CoffeeA();
            System.out.println("Coffee latte");
        }
        else if (a==2)
        {
            c=new CoffeeB();
            System.out.println("strong coffee");
        }
        else if (a==3)
        {
            c=new CoffeeC();
            System.out.println("espresso");

        }
        else
        {
            System.out.println("no coffee found");
        }
        return c;


    }
}
