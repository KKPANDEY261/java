class NSTI{
    String college="NSTI Kolkata";
    String course="CSA";
    void show(){
        System.out.println("College name: " + college);
        System.out.println("Course name: " + course);
    }
}

class Divya extends NSTI{
    String name="Divya";
    void print1(){
        System.out.println("Name: " + name);
        show();
    }
}

class Tosh extends NSTI{
    String name="Tosh Kumari";
    void print1(){
        System.out.println("Name: " + name);
        show();
    }
}

class Ruk extends NSTI{
    String name="Rukhmani Devangan";
    void print1(){
        System.out.println("Name: " + name);
        show();
    }
}

class HierarchicalInhert{
    public static void main(String args[]){
        NSTI obj1=new NSTI();
        Divya obj2= new Divya();
        Tosh obj3=new Tosh();
        Ruk obj4=new Ruk();
        obj1.show();
        obj2.print1();
        obj3.print1();
        obj4.print1();
    }
}