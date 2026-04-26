interface Circle
{
    //Characteristics
    float pi = 3.14f; // interface characteristic is Bydefault public, static, final

    //Behaviours

    float Area(float radius);   //Bydefault pubic abstract
    float Circumference(float radius);   //Bydefault pubic abstract
}

class Marvellous implements Circle
{
    //error due to missing body of area & circumference
}

class InterfaceDemoMethod
{
    public static void main(String args[])
    {
        Marvellous mobj = new Marvellous();
    }
}