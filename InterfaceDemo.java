interface Circle
{
    //Characteristics
    float pi = 3.14f; // interface characteristic is default public, static, final
}


class InterfaceDemo
{
    public static void main(String args[])
    {
        System.out.println(Circle.pi);
        Circle.pi = 7.12f;      //error due to final 
    }
}