
import java.util.Scanner;

class practical7 {

    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        System.out.println("enter string:");
        String st= cin.nextLine();

        System.out.println("number of times:");
        int n= cin.nextInt();
        for(int i=0;i<n; i++)
        {
            System.out.print(st.substring(0,3));
        }


    }
}
