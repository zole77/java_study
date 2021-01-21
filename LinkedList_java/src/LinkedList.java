public class LinkedList {

    private Node head;
    private Node tail;
    private Node tmp;

    private int size = 0;
    private class Node{
        int data;
        Node next;
        public Node(int input){
            this.data = input;
            this.next = null;
        }
        public String toString(){
            return String.valueOf(this.data);
        }
    }

    public void addFirst(int input){
        Node n = new Node(input);
        n.next = head;
        head = n;
        if(size == 0){
            tail = n;
        }
        size++;
    }
    public void addLast(int input){
        Node n = new Node(input);
        if(size == 0){
            addFirst(input);
        }
        else{
            tail.next = n;
            tail = n;
            size++;
        }
    }

    public void delete(int input){
        tmp = head;
        // 첫번째 원소를 지울 경우
        if(head.data == input){
            head = head.next;
            return;
        }

        while(tmp.next.data != input){
            tmp = tmp.next;
            if(tmp.next.data == input){
                System.out.printf("=== 찾았음 %d 얘 다음꺼 지울거야 !\n\n", tmp.data);
                if(tmp.next == tail){
                    tail = tmp;
                    tmp.next = null;
                    return;
                }else{
                    tmp.next = tmp.next.next;
                    return;
                }
            }
        }
    }

    public void PrintList(){
        tmp = head;
        int index = 1;
        while(tmp != null){
            System.out.printf("[Node%d:%d] - ", index++, tmp.data);
            tmp = tmp.next;
        }
    }
}
