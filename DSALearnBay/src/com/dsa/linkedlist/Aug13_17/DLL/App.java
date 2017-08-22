package com.dsa.linkedlist.Aug13_17.DLL;

/**
 * Created by vikas.e.mishra on 8/13/2017.
 */
public class App {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addNodeAtEnd(5);
        dll.addNodeAtEnd(6);
        dll.addNodeAtEnd(7);
        dll.addNodeAtEnd(8);
        dll.addNodeAtEnd(9);

        dll.printDll();
    }
}
