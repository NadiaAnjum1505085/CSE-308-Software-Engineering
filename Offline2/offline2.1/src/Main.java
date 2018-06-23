import java.util.Scanner;

public class Main {
    public static void main(String arg[])
    {
        VendingMachine ven=new VendingMachine(500);
        ProductChange productChange=new ProductChange();
        ProductnoChange productnoChange=new ProductnoChange();
        InsufficientCur insufficientCur=new InsufficientCur();
        InsufficientInventory insufficientInventory=new InsufficientInventory();
        InsufficientChange insufficientChange=new InsufficientChange();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("choose the product : 1.Lays chips 2.Sneakers 3.Mountain Dew 4.Exit");
            int choice=sc.nextInt();
            if(choice>4)
            {
                System.out.println("Invalid Choice");
                continue;
            }
            if(choice==4)
            {
                break;
            }
            if(ven.getproductamount(choice-1)==0)
            {
                insufficientInventory.DoAction(ven);
                continue;
            }
            System.out.print("Enter money please:");
            int money=sc.nextInt();
            if(money<ven.getproductprice(choice-1))
            {
                insufficientCur.DoAction(ven);
                continue;
            }
            if(money==ven.getproductprice(choice-1))
            {
                productnoChange.DoAction(ven);
                ven.getproduct(choice-1);
            }
            if(money>ven.getproductprice(choice-1))
            {
                int cur=money-ven.getproductprice(choice-1);
            //    System.out.println(cur+" "+ven.getBalance());
                if(cur>=ven.getBalance())
                {
                    insufficientChange.DoAction(ven);
                }
                else
                {
                    productChange.DoAction(ven);
                    System.out.println(cur);
                    ven.getproduct(choice-1);
                }
            }


        }

    }
}
