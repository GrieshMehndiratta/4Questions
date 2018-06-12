public class Overload1
{
    public void Print(Integer i)
    {
        System.out.println(i);
    }
    public void Print(int No)
    {
        System.out.println(No);
    }
    public void Print(float F)
    {
        System.out.println(F);
    }
    
    public static void main(String [] args)
    {
        Overload1 mv = new Overload1();
         
        Integer arg = null;
        mv.Print(arg);
        mv.Print(12.09f);
        mv.Print(10);
    }
}
