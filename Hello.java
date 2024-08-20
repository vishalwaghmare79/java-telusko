import java.util.Scanner;

class Hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String name = sc.nextLine();
        System.out.print("username: " + name);
    }
}