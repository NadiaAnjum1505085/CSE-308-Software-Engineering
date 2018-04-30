import java.util.Scanner;

public class chef {
    public burger getBurger()
    {
        System.out.println("number of burgers you want: ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        burger b=new burger();
        for (int i=0;i<num;i++)
        {
            System.out.println("enter choice: 1.chicken 2.beef");
            int option = scanner.nextInt();
            if(option==1)
            {
                b.addburger(new chicken());
            }
            else
                b.addburger(new beef());
        }
        return b;
    }
}
