package com.linkedlist.doublelinkedlist;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedList newList = new DoubleLinkedList();
		
		newList.createDoubleLinkedList(6);
		
		newList.insertInLinkedList(99);
		
		newList.insertInLinkedList(1);
		
		newList.insertInLinkedList(74);
		
		newList.insertInLinkedList(8);
		
		newList.printDoubleLinkedList();
		
		System.out.println("Size: " + newList.getSize());
		
		System.out.printf("===========================================================================\n\n");
		
		newList.insertInLinkedList(99999, 2);
		
		newList.insertInLinkedList(99999, 4);
		
		newList.printDoubleLinkedList();
		
		System.out.println("Size: " + newList.getSize());
		
		System.out.printf("===========================================================================\n\n");
		
		newList.printNode(4);
		
		newList.deleteNode(3);

		newList.deleteNode(5);
		
		newList.printDoubleLinkedList();

		System.out.println("Size: " + newList.getSize());
		
		System.out.printf("===========================================================================\n\n");
	}
}
