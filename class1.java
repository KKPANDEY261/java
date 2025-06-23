class hello2{
    String Name;
    String Address;
    long Mobile;
    public hello2(String N,String Address,long Mobile){
        this.Name=N;
        this.Address=Address;
        this.Mobile=Mobile;
    }
}
class hello3{
    String Name;
    String Address;
    long Mobile;
}

public class class1{
    public static void main(String[] args) {
        hello2 person1=new hello2("pandey", "kolkata", 7388847685L);
        System.out.println("Name:-"+person1.Name);
        System.out.println("Address:-"+person1.Address);
        System.out.println("Name:-"+person1.Mobile);

        hello3 person2=new hello3();
        person2.Name="pandey";
         person2.Address="howrah";
          person2.Mobile=7388847685L;
            System.out.println("Name:-"+person2.Name);
        System.out.println("Address:-"+person2.Address);
        System.out.println("Name:-"+person2.Mobile);
    }
}
 