package org.example;

import java.util.Objects;

class ListNode {
    private Integer value;


    private ListNode nextNode;
    private ListNode previousNode;

    public ListNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    public ListNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(ListNode previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode node)) return false;
        return Objects.equals(value, node.value) && Objects.equals(nextNode, node.nextNode) && Objects.equals(previousNode, node.previousNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, nextNode, previousNode);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nextNode=" + nextNode +
                ", previousNode=" + previousNode +
                '}';
    }
}
public class MyLinkedList {
    private ListNode firstNode = null;

    public void add(Integer value){
        ListNode newNode = new ListNode(value);
        if(firstNode==null){
            firstNode = newNode;
        } else {
            ListNode runningNode = firstNode;
            while(runningNode.getNextNode()!=null){
                runningNode=runningNode.getNextNode();
            }
            newNode.setPreviousNode(runningNode);
            runningNode.setPreviousNode(newNode);
        }
    }

    public void remove(Integer value){
        if(firstNode==null){
            return ;
        }
        if(firstNode.getNextNode()==null){
            if(firstNode.getValue().equals(value)){
                firstNode=null;
                return;
            }
        }
        ListNode runningNode = firstNode;
        while(runningNode.getNextNode()!=null){
            if(runningNode.getValue().equals(value)){
                if(runningNode.getNextNode()!=null) {
                    runningNode.getPreviousNode().setNextNode(runningNode.getNextNode());
                    runningNode.getNextNode().setPreviousNode(runningNode.getPreviousNode());
                } else {
                    runningNode.getPreviousNode().setNextNode(null);
                }
                break;
            }
            runningNode=runningNode.getNextNode();
        }
    }
}
