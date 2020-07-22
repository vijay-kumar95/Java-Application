class OuterStaticNestedClassesDemo
{  
    static class Nested
    {
        public void m1()
        {
            System.out.println("Nested class method");
        }
    }
    public  static void main(String[] args)
    {
        Nested n=new Nested();
        n.m1();
    }

}