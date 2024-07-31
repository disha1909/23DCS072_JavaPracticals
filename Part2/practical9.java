
import java.util.Scanner;

import java.util.*;
class practical9 {


    static StringBuffer dis ()
    {
        Scanner in = new Scanner(System.in);
        char s2;
        System.out.print("Enter string : ");
        StringBuffer s1 = new StringBuffer(in.nextLine());
        System.out.print("Enter no of times to repeat characters : ");
        int x = in.nextInt();

        StringBuffer value = new StringBuffer();

        for (int j = 0; j < s1.length(); j++) {
            s2 = s1.charAt(j);

            for (int i = 0; i < x; i++)
            {
                value = value.append(s2);
            }

        }
        return value;
    }


    public static void main (String[]args)

    {
        StringBuffer s2 = new StringBuffer(dis());
        System.out.println(s2);

    }

}

