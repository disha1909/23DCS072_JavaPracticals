
import java.util.Scanner;

 class practical10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("Length of the string: " + length);

        String lowercase = input.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        String sorted = sortString(input);
        System.out.println("Sorted string: " + sorted);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        int n = charArray.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                
                if (charArray[i - 1] > charArray[i]) {
                   
                    char temp = charArray[i - 1];
                    charArray[i - 1] = charArray[i];
                    charArray[i] = temp;
                    swapped = true;

                }
            }
        } while (swapped);

        return new String(charArray);
    }
}
