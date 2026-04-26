class Base
{
    public int i,j;

    public void fun()
    { System.out.println("Inside base fun."); }
    
    public void gun()
    {
        System.out.println("Inside base gun.");
    }
    
    public void sun()
    {
        System.out.println("Inside base sun.");
    }
}

class Derived extends Base
{
    public int x,y;

    public void gun()
    {
        System.out.println("Inside derived gun.");
    }
    
    public void sun()
    {
        System.out.println("Inside derived sun.");
    }

    public void run()
    {
        System.out.println("Inside derived run.");
    }

}

class RMD_Overriding
{
    public  static void main(String a[])
    {
        Base bobj = new Derived();      //Upcasting

        bobj.fun();
        bobj.gun();
        bobj.sun();
        bobj.run();       
    }
}