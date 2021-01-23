class Calculator {
    int left, right;
    int third;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    /*
    Overloading을 구현한 부분,
    자바에서는 같은 메소드라도, 매개변수가 다르다면
    다른 메소드로 인식한다.
    ※ 리턴 값이 다르면, 불가능.
     */
    public void setOperands(int left, int right, int third) {
        this.setOperands(left, right);
        this.third = third;
    }

    public void add(){
        System.out.println(this.left + this.right + this.third);
    }

    public void avg(){
        System.out.println((this.left + this.right + this.third)/3);
    }
}

public class overloading_cal {
    public static void main(String[] args){
        Calculator c3 = new Calculator();
        c3.setOperands(10,20);
        c3.add();
        c3.avg();
        c3.setOperands(10,20,30);
        c3.add();
        c3.avg();
    }
}
