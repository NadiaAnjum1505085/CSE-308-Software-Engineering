import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        InfoTransCen ITC=new InfoTransCen();
        Students st[]=new Students[4];
        st[0] =new Student1();
        st[1]=new Student2();
        st[2]=new Student3();
        st[3]=new Student4();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the task: 1.Register 2.Unregister 3.Send text 4.Exit");
            int c=sc.nextInt();
            if(c==1)
            {
                System.out.println("1."+st[0].getname());
                System.out.println("2."+st[1].getname());
                System.out.println("3."+st[2].getname());
                System.out.println("4."+st[3].getname());
                int choice=sc.nextInt();
                if(choice<5)
                {
                    ITC.Registered(st[choice-1]);
                }
                else
                    System.out.println("Invalid choice");

            }
            else if(c==2)
            {
                System.out.println("1."+st[0].getname());
                System.out.println("2."+st[1].getname());
                System.out.println("3."+st[2].getname());
                System.out.println("4."+st[3].getname());
                int choice=sc.nextInt();
                if(choice<5)
                {
                    ITC.unregister(st[choice-1]);
                }
                else
                    System.out.println("Invalid choice");

            }
            else if(c==3)
            {
                String p=sc.nextLine();
                p=sc.nextLine();

               ITC.setInfo(p);
            }
            else
                break;
        }

    }
}
