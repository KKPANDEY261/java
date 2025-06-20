class hello{
    String name;
    String address;
    long mobile;
    public hello(String name,String address,long mobile){
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }
}

class hello1{
    String name;
    String address;
    long mobile;}

public class classandobject {
    public static void main(String[] args) {
        hello person=new hello ("karan","howrah",7388847685L);
        hello1 person1=new hello1();
        person1.name="pandey";
        person1.address="kolkata";
        person1.mobile=7388847685L;

        System.out.println("Name:-"+person.name);
         System.out.println("Address:-"+person.address);
          System.out.println("Mobile:-"+person.mobile);
        System.out.println("Name:-"+person1.name);
         System.out.println("Address:-"+person1.address);
          System.out.println("Mobile:-"+person1.mobile);
    }
}


