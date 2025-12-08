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
