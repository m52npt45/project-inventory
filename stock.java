public class stock{
    double productid;
    String name;
    double productno;
    //constroctor
    public stock(double productid,String name,double productno){
        this.productid = productid;
        this.name = name;
        this.productno = productno;
    }
    public void display(){
        System.out.println("all are in stock");
        System.out.println("Product Id: "+productid+"\nName : "+name+"\nProduct No:"+productno+"");
    }
}
