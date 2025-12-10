import java.util.*;
public class Main{
    
    public static Node<Integer> ex1(Node<Integer> l1, Node<Integer> l2) {
		Node<Integer> h = new Node<Integer>(-1);
		Node<Integer> p = h;
		Node<Integer> a = l1;
		Node<Integer> b = l2;
		    while (a!=null&&b!=null){
		        if(a.getValue()>b.getValue()){
		        p.setNext(new Node<>(b.getValue()));
		        b=b.getNext();
		        p=p.getNext();
			    }
			    else{
			        p.setNext(new Node<>(a.getValue()));
		            a=a.getNext();
		            p=p.getNext();
			    }
		}
		while (a!=null){
		    p.setNext(new Node<>(a.getValue()));
		    a=a.getNext();
		    p=p.getNext();
		}
		
		while (b!=null){
		    p.setNext(new Node<>(b.getValue()));
		    b=b.getNext();
		    p=p.getNext();
		}
		return h.getNext();
    }
	
    
static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
    {
        
    int[] a={1,2,25};
    int[] b={2,2,3,20};
    Node<Integer> l1 = build(a);
    Node<Integer> l2 = build(b);
    System.out.println(ex1(l1, l2));
    System.out.println(l1);
    System.out.println(l2);
    }
    
}

//פעולת העזר build
public static Node<Integer> build(int[] a) {
		Node<Integer> h = new Node<Integer>(-1);
		Node<Integer> p = h;
		Node<Integer> x;
		for (int i = 0; i < a.length; i++) {
			x = new Node<Integer>(a[i]);
			p.setNext(x);
			p = p.getNext();
		}
		return h.getNext();
	}
}



import java.util.*;
public class Main{

    public static Node<Integer> selectionSort(Node<Integer> head) {
        if (head == null || head.getNext() == null) {
            return head; 
        }

        Node<Integer> sortedHead = null;
        Node<Integer> sortedTail = null;

        while (head != null) {
            Node<Integer> minPrev = null;
            Node<Integer> minNode = head;
            Node<Integer> current = head;
            Node<Integer> prev = null;

            while (current != null) {
                if (current.getValue() < minNode.getValue()) {
                    minNode = current;
                    minPrev = prev;
                }
                prev = current;
                current = current.getNext();
            }

            if (minPrev == null) {
                head = head.getNext(); 
            }
            else {
                minPrev.setNext(minNode.getNext()); 
            }

            minNode.setNext(null);

            if (sortedHead == null) {
                sortedHead = minNode;
                sortedTail = minNode;
            }
            else {
                sortedTail.setNext(minNode);
                sortedTail = minNode; 
            }
        }

        return sortedHead;
    }
    
///////////////////////////////////////////////////////////////
    static Scanner input=new Scanner(System.in);
        public static void main(String[] args) {
        int[] data = {4,1,30,66,5}; 
        
        Node<Integer> originalHead = build(data); 

        System.out.println(originalHead); 
        
        Node<Integer> sortedHead = selectionSort(originalHead);

        if (sortedHead != null) {
             System.out.println(sortedHead); 
        } else {
             System.out.println("הרשימה ריקה");
        }
    }

//פעולת העזר build
public static Node<Integer> build(int[] a) {
		Node<Integer> h = new Node<Integer>(-1);
		Node<Integer> p = h;
		Node<Integer> x;
		for (int i = 0; i < a.length; i++) {
			x = new Node<Integer>(a[i]);
			p.setNext(x);
			p = p.getNext();
		}
		return h.getNext();
	}
}
