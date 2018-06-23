public class Student3 implements Students {
    String name="Max";
    String phone="017121399265";
    @Override
    public void getText(String s) {
        System.out.println("Receiver: "+name+" \n"+"Message : "+s+"\n"+"Sent to: "+phone);
    }

    @Override
    public String getname() {
        return name;
    }
}
