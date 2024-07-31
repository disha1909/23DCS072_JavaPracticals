import java.util.*;
class area {
    int l;
    int b;
    area(int a,int c)
    {
        l=a;
        b=c;
    }
    public void returnarea(){
        int ar=l*b;
        System.out.println("Area is "+ ar);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the length : ");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        System.out.println("Enter the breadth : ");
        int b=sc.nextInt();
        area a1=new area(l, b);
        a1.returnarea();
        System.out.println("DISHA PATEL 23DCS072");
    }
};
