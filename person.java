public class person {
    double id;
    String name;
    String password;
    String phone;

    //constractor
    public person() {

            }

    //overloading constractor
    public person(String name, String password, String phone, double id) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
}

