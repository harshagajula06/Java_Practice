class Constructor1
{
    int a,b,c;
    Constructor1(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void logic()
    {
        if (a<b && a<c)
            System.out.println("a is smaller");
        else if (b<a && b<c)
            System.out.println("b is smaller");
        else
            System.out.println("c is smaller");
    }
}