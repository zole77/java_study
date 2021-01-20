public class formula {

    int left;
    int right;

    public formula(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void add(){
        System.out.printf("%d + %d = %d\n", this.left, this.right, this.left + this.right);
    }

    public void sub(){
        System.out.printf("%d - %d = %d\n", this.left, this.right, this.left - this.right);
    }

    public void mul(){
        System.out.printf("%d * %d = %d\n", this.left, this.right, this.left * this.right);
    }

    public void div(){
        System.out.printf("%d / %d = %d\n", this.left, this.right, this.left / this.right);
    }

}
