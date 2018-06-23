import java.util.ArrayList;
import java.util.List;

public class InfoTransCen {
    private List<Students> student=new ArrayList<>();
    private String text="";
    public  void Registered(Students s)
    {
        if(student.indexOf(s)!=-1)
        {
            System.out.println("You are already registererd");
            return;
        }
        System.out.println("The student has been registered.");
        student.add(s);
    }
    public void unregister(Students s)
    {
        if(student.indexOf(s)!=-1)
        {
            student.remove(s);
            System.out.println(s.getname()+" has been removed");
            return;
        }
        System.out.println("The student has not registered.");


    }
    public void setInfo(String t)
    {
        text=t;
        notifyStu();
    }
    public String getInfo()
    {
        return  text;
    }

    public void notifyStu() {
        for(Students s:student)
        {
            s.getText(text);
        }
    }
}
