
public class class2 {
       public static void main(String[] args) {
          addition person=new addition("pandey");
         // person.name="karan";
          //person.address="kolkata";
         // person.mobile=7388847685L;

          System.out.println(person.name);
          System.out.println(person.address);
          System.out.println(person.mobile);
          
          
       }
    
}
   

      class addition{
           String name="karan";
           //String name;
           String address="howrah";
           //String address;
           Long mobile=738888888888L;
           //Long mobile;

           public addition(){
                       
           }
           public addition(String a){
                this.name=a;
           }
           public addition(String a,String b){
            this.name=a;
            this.address=b;
           }

      }