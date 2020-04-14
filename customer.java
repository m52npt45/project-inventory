public class customer extends  login{
    double id;
    String name;
    String phone;
    String password;

    //constractor
    public customer(double id, String name,String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;

    }

    public void display() {
        System.out.println("customer info : ");
        System.out.println("ID=" + id + "\nName = " + name + "\nNumber = "+phone+"\nPassword = "+password +"");
    }

    @Override
    public void id(String id) {
        System.out.println("your id is : " + id);
    }

    @Override
    public void pass(String pass) {
        System.out.println("successfully log in ");

    }
}
