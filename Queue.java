package Linked;

class Element{
	
	int data;
	Element next;
	Element prev;
	
	  Element(int data){
		  this.data=data;
		  next=null;
		  prev=null;
	  }
	
}
 class QueueOperations{
	
	Element head; 
	Element tail;
    int max_size=5;
	int size=0;
	
	
	boolean isEmpty() {
		if(tail==null) {
			return true;}
		
		else {return false;}
	}
	
	boolean isFull() {
		if(size<=max_size)
			return false;
		
		else 
			return true;
	}
	
	
    void insert(int data) {
		
    if(size<=max_size)    {		
    	
    	
    	if(isEmpty()==true) {	
		    Element newElement=new Element(data);
		    tail=newElement;
		    head=newElement;
		    size++;
		}
		
		else {
			Element newElement=new Element(data);
			newElement.next=tail;
			tail.prev=newElement;
			tail=newElement;
			size++;
		}
		
    	
                           }
    	
    	
	}
	
    
    void dequeue() {
     head=head.prev;	
     head.next=null;  	
    }

    
     void printOrIterate() {
		Element iterator=tail;
		while(iterator!=null) {
			System.out.println(iterator.data);
            iterator=iterator.next; }
    }
     
     int size() {
    	 int size=0;
    	 
    	 Element iterator=tail;
       while(iterator!=null) {
    	size++;
    	iterator=iterator.next;
       }
       return size;
     }
     
     void rearElement() {
    	 System.out.println("rear element:"+tail.data);
     }
     
     
     void frontElement() {
    	 System.out.println("front element:"+head.data);
     }
 }
public class Queue {


	public static void main(String[] args) {

    QueueOperations op=new QueueOperations();	
		
         System.out.println("is empty:"+op.isEmpty());
         
         op.insert(0);
		 op.insert(1);
		 op.insert(2);
		 op.insert(3);
		 op.insert(4);
		 op.insert(5);
		 
		 op.printOrIterate();
		 
		 System.out.println("is empty:"+op.isEmpty());
		 System.out.println("size:"+op.size()); 
		
		 op.rearElement();
		 op.frontElement();
	
		 System.out.println("isFull:"+op.isFull());
		 
		 op.dequeue();
		 op.dequeue();
	
		 System.out.println("-------------");
	
		 op.printOrIterate();
	}

}
