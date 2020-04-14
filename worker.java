public class worker extends person {
   String workerId;
    // constroctor


    public worker(String name, String password, String phone, double id, String workerId) {
        super(name, password, phone, id);
        this.workerId = workerId;
    }

    public void display(){
        System.out.println("worker id : " + workerId + "\nName: "+name+"\nPassword : "+password+"\nContact : "+phone+"");
    }
}
