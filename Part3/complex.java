import java.util.Scanner;

class Comp{

    void sum(int r1 , int i1 , int r2 , int i2)
    {
        int r = r1 + r2;
        int i = i1 + i2;
        System.out.println("Sum of two complex numbers are :" + r + " + " + i + "i" );
    }

    void difference(int r1 , int i1 , int r2 , int i2)
    {
        int r = r1 - r2;
        int i = i1 - i2;
        System.out.println("Difference of two complex numbers are :" + r + " + " + i + "i" );
    }

    void product(int r1 , int i1 , int r2 , int i2)
    {
        int r = r1*r2 - i1*i2;
        int i = r1*i2 + i1*r2;
        System.out.println("Product of two complex numbers are :" + r + " + " + i + "i" );
    }
}

 class complex {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******Enter the real and imaginary numbers for First Complex Number******");
        System.out.print("Enter the real part :");
        int r1= sc.nextInt();
        System.out.print("Enter the imaginary part :");
        int i1= sc.nextInt();
        System.out.println("First complex number is :" + r1 + " + " + i1 + "i" );
        System.out.println();

        System.out.println("******Enter the real and imaginary numbers for Second Complex Number******");
        System.out.print("Enter the real part :");
        int r2= sc.nextInt();
        System.out.print("Enter the imaginary part :");
        int i2= sc.nextInt();
        System.out.println("Second complex number is :" + r2 + " + " + i2 + "i" );
        System.out.println();
        Comp c = new Comp();
        c.sum(r1,i1,r2,i2);
        c.difference(r1,i1,r2,i2);
        c.product(r1,i1,r2,i2);
        System.out.print("DISHA PATEL 23DCS072");
    }
}
