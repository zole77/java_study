public class Main {
    public static void main(String[] args){
        LinkedList L1 = new LinkedList();
        L1.addLast(10);
        L1.addLast(20);
        L1.addLast(30);
        L1.addLast(40);
        L1.addLast(50);
        L1.addFirst(1);
        L1.add(2,33);
        L1.delete(20);
        L1.Modify(1,39);
        L1.PrintList();
    }
}
