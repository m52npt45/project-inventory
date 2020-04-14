public class owner extends login{
double id;
String name;
String phone;
String password;
// constractor
    public owner(double id,String name,String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;

    }
     public void display(){
         System.out.println("ID : "+id+"\nName : "+name+"\nContact : "+phone+"\nPassword : "+password+"");
     }

    @Override
    public void id(String id) {
        System.out.println("your id " + id);
    }

    @Override
    public void pass(String pass) {
        System.out.println("successfully log in");
    }
}
