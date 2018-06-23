public class Student4 implements Students {
    String name="Rene";
    String phone="0191213565";
    @Override
    public void getText(String s) {
        System.out.println("Receiver: "+name+" \n"+"Message : "+s+"\n"+"Sent to: "+phone);
    }

    @Override
    public String getname() {
        return name;
    }
}
