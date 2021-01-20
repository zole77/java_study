import java.util.Scanner;


public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자?");
        int left = sc.nextInt();
        System.out.println("두번째 숫자?");
        int right = sc.nextInt();

        formula Cal = new formula(left, right);
        // Cal은 인스턴스, formula는 생성자
        // left 와 right로 초기화하여 formula 클래스 실행
        Cal.add();
        Cal.sub();
        Cal.mul();
        Cal.div();
    }
}
