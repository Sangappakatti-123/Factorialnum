class Factorial_wr //without with
{
static int fac()
{
System.out.println("Square started");
int fact=1,n=5;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
//System.out.println("Square ended");
}
public static void main(String[] args)
{
System.out.println("Main started");
int factorial=fac();
System.out.println(factorial);
System.out.println("Main ended");
}
}