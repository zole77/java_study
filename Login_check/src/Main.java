import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        membership m1 = new membership();
        m1.Signup();

        Scanner sc = new Scanner(System.in);

        String user_id;
        String user_password;

        System.out.print("아이디: ");
        user_id = sc.nextLine();
        System.out.print("비밀번호: ");
        user_password = sc.nextLine();

        Check c1 = new Check(user_id, user_password);
    }
}
