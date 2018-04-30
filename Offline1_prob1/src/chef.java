import java.util.Scanner;

public class chef {
    public burger getBurger()
    {
        System.out.println("number of burgers you want: ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        burger b=new burger();
        return b;
    }
}
