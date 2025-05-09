class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}

class B extends A
{
    @Override
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}

class C extends A
{
    @Override
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}

class DynamicDispatch
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();
        A obj;
        obj = a;
        obj.m1();
        obj = b;
        obj.m1();
        obj = c;
        obj.m1();
    }
}
