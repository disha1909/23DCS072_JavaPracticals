import java.util.Scanner;

 class practical11 {

    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        System.out.println("enter string:");
        String st= cin.nextLine();
        String ct= st.replace('H','A');

        System.out.println("length:"+st.length());

        System.out.println("replace H to A:"+st.replace('H','A'));
        System.out.println(ct);
        System.out.println("lowercase:"+ct.toLowerCase());
    }
}
