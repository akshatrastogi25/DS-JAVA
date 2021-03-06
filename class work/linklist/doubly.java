import java.util.*;

public class Main
{
     class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    Node head, tail = null;  
  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail; 
            tail = newNode;  
            tail.next = null;  
        }  
    }
    
  public void addNodeStart(int data)
  {
      Node newNode = new  Node(data);
      if(head == null)
      {
          head = tail = newNode;
          head.previous = null;
          tail.next = null;
      }
      else
      {
    head.previous = newNode;
    newNode.next = head;
    newNode.previous = null;
    head = newNode;
      }
  }
      public void addNodeAtIndex(int data,int index)
      {
          Node newNode=new Node(data);
          if(head == null)
          {
          head = tail = newNode;
          head.previous = null;
          tail.next = null;
          }
          else
          {
              Node temp=head;
              for(int i=0;i<index-1;i++)
              {
                  temp=temp.next;
              }
              
              newNode.next=temp.next;
              temp.next=newNode;
              newNode.previous=temp;
           
          }
          
  }
  
  public void deleteAtEnd()
  {
        if(head==null)
        {
            System.out.println("The list is already empty");
        }
        else
        {
            tail=tail.previous;
            tail.next=null;
        }
  }
  
  public void deleteAtStart()
  {
        if(head==null)
        {
            System.out.println("The list is already empty");
        }
        else
        {
           head=head.next;
           head.previous=null;
        }
  }
  
    public void display() { 
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Doubly linked list: ");  
        while(current != null) {  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
          Main dList = new Main();  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
        
        dList.addNodeStart(0);
        
        dList.addNodeAtIndex(10,4);
        dList.addNodeAtIndex(11,6);
        
        dList.deleteAtEnd();
        
        dList.deleteAtStart();
        
        dList.display(); 
    }  
}
