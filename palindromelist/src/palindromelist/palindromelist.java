package palindromelist;

import java.util.Scanner;
import java.util.*;

public class palindromelist {
	public static void main(String args[]){
		int option;
		List l=new List();
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1. Insert Begin"+"\n"+"2. Palindrome");
			System.out.println("Enter 0 to exit");
			Scanner sc=new Scanner(System.in);
			option=sc.nextInt();
			switch(option){
			case 1: l.insertBegin();
			l.print();
			break;
			case 2: l.palindrome();
			break;
			case 0:System.exit(0);
			}
		}
		}
}
class List{
	private class Node{
		int data;
		Node next;
	}
	Node head=null;
	public void print(){
		Node n=new Node();
		n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	public void palindrome(){
		Stack<Integer> s=new Stack<Integer>();
		Node temp=head;
		while(temp!=null){
			s.push(temp.data);
			temp=temp.next;
		}
		Node temp2=head;
		for(int i=0;i<s.size();i++){
		if(s.get(i)==temp2.data){
			temp2=temp2.next;
		}
		else{
			System.out.println("Not a palindrome");
		}
		}
	}
	public void insertBegin(){
		Node node=new Node();
		if(head==null){
			head=node;
			Scanner sc=new Scanner(System.in);
			head.data=sc.nextInt();
			head.next=null;
		}
		else{
			node.next=head;
			Scanner sc=new Scanner(System.in);
			node.data=sc.nextInt();
			head=node;
		}
	}
}
