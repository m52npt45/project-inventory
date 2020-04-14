public class product {
    double id;
    String name;
    String date;
    String exdate;
    //constractor
    public product(double id,String name,String date,String exdate){
        this.id = id;
        this.name = name;
        this.date = date;
        this.exdate = exdate;
    }
    public void display(){
        System.out.println("\n"+"ID : "+id+"\nName : "+name+"\nDate : "+date+"\nExpdate : "+exdate+"");
    }
}
