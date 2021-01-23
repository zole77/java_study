import java.io.PrintStream;

class Calculator{

    int left, right;

    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void add(){
        System.out.println(this.left + this.right);
    }

    public int avg(){
        return ((this.left+this.right)/2);
    }
}


class SubCal extends Calculator{
    public void add(){
        System.out.printf("%d + %d = %d 입니다.\n", this.left, this.right, this.left + this.right);
    }

    public int avg(){
        return super.avg();
    }
}

public class Cal_overriding {
    public static void main(String[] args){
        int left = 10;
        int right = 20;

        SubCal a3 = new SubCal();
        a3.setOperands(left, right);
        a3.add();
    }
}
