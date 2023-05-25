package com.DataStructure;

public class SingleLinkedList {
	ListNode head;

    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  void print(){
        ListNode currentNode=head;
        while(null !=currentNode){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        ListNode newNode=new ListNode(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;


    }

    public void addEnd(int data){
        ListNode newNode=new ListNode(data);
        if (head==null){
            head=newNode;
            return;
        }

        ListNode currentNode=head;
        while(null!=currentNode.next){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    public int size(){
        int size=0;
        ListNode currentNode=head;
        if(head==null){
            return size;
        }
        while(currentNode!=null){
            size++;
            currentNode=currentNode.next;
        }

        return size;
    }

    public static void main(String[] args) {
    	SingleLinkedList sll=new SingleLinkedList();
        sll.addEnd(10);
        sll.addEnd(20);
        sll.addFirst(30);
       /* ListNode firstNode=new ListNode(10);
        sll.head=firstNode;
        ListNode secondNode=new ListNode(20);
        sll.head.next=secondNode;

        ListNode third=new ListNode(30);
        secondNode.next=third;*/
        sll.print();
        System.out.println("size: "+sll.size());



    }
}
