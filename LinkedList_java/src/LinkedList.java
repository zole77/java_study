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
            size--;
            return;
        }

        while(tmp.next.data != input){
            tmp = tmp.next;
            if(tmp.next.data == input){
                size--;
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

    // 노드의 위치를 반환
    Node node(int index){
        Node x = head;
        for(int i = 0; i < index ; i++){
            x = x.next;
        }
        return x;
    }

    // 원하는 위치에 노드 삽입
    public void add(int k, int input){
        if(k==0){
            addFirst(input);
        }
        Node tmp1 = node(k-1);      // 원하는 위치 이전의 노드를 찾아서
        Node tmp2 = tmp1.next;
        Node n = new Node(input);
        tmp1.next = n;      // 그 노드의 next 를 새로 추가할 노드와 연결하고
        n.next = tmp2;
        size++;
    }

    public void Modify(int k, int input){
        if(k==0){
            System.out.println("수정할 노드가 없습니다.");
        }
        Node tmp1 = node(k);
        tmp1.data = input;
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
