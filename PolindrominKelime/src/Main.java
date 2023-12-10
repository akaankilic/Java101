import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindromik olup olmadığını öğrenmek istediğiniz kelimeyi giriniz :");
        String text = input.nextLine();
        if (isPalindrome(text)) {
            System.out.println(text + " Kelimesi Palindromdur");
        } else {
            System.out.println(text + " Kelimesi Palindrom Değildir");
        }

    }
}