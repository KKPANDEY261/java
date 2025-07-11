class One {
    public void printOne()
    {
        System.out.println("One two ka four");}
}
  class Two extends One {
    public void printTwo() {
         System.out.println("four two ka one"); 
         }}
class Three extends Two {// Drived class
    public void printThree()
    {
        System.out.println("My name is Lakhan");
    }}
public class MultiLevel {
    public static void main(String[] args)
    {
        Three g = new Three();
        g.printOne();
        g.printTwo();
        g.printThree();
    }
}