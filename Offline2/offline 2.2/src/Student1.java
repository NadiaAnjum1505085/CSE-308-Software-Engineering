public class Student1 implements Students {
    String name="Antara";
    String phone="015121334265";
    @Override
    public void getText(String s) {
        System.out.print("Receiver: "+name+" \n"+"Message : "+s+"\n"+"Sent to: "+phone);
    }

    @Override
    public String getname() {
        return name;
    }
}
