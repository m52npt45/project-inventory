public class main {
    public static void main(String[] args){
        System.out.println("customer log in");
        customer cr = new customer(16.567,"fgh","019********");
        cr.id("1200");
        cr.pass("****");

        //owner ow = new owner(12.00,"xyz","016********");


        product pd = new product(1231.2424,"vbn","12 april,2020","12 april,2021");
        stock st = new stock(126.344,"tyu",1266.36);
        //ow.display();

        cr.display();
        pd.display();
        st.display();
    }

}
