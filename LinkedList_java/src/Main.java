public class Main {
    public static void main(String[] args){
        LinkedList L1 = new LinkedList();
        L1.addLast(10);
        L1.addLast(20);
        L1.addLast(30);
        L1.PrintList();
        System.out.println("");
        L1.addFirst(40);
        L1.addLast(50);
        L1.delete(40);
        L1.addLast(60);
        L1.addLast(70);
        L1.add(2,22);
        L1.PrintList();
    }
}
