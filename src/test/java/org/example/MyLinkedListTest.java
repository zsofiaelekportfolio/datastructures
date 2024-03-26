package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    @Test
    public void testRemoveWhenListIsEmpty(){
        //GIVEN
        MyLinkedList myLinkedList = new MyLinkedList();

        //WHEN
        myLinkedList.remove(1);

        //THEN
    }

    @Test
    public void testRemoveFirstElement(){
        //GIVEN
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        //WHEN
        myLinkedList.remove(1);

        //THEN

    }
    @Test
    public void testRemoveMiddleElement(){
        //GIVEN
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        //WHEN
        myLinkedList.remove(2);

        //THEN

    }

    @Test
    public void testRemoveLastElement(){
        //GIVEN
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        //WHEN
        myLinkedList.remove(3);

        //THEN

    }

}