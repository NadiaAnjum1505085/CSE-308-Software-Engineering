public class Student2 implements Students {
    String name="Nadia";
    String phone="015131334265";
    @Override
    public void getText(String s) {
        System.out.println("Receiver: "+name+" \n"+"Message : "+s+"\n"+"Sent to: "+phone);
    }

    @Override
    public String getname() {
        return name;
    }
}
