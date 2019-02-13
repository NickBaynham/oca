package com.github.nickbaynham.examples;

public class LinkedStack {
    static interface Linkable {
        public Linkable getNext();
        public void setNext(Linkable node);
    }

    Linkable head;

    public void push(Linkable node) {

    }

    public Object pop() {return null;}

}

class LinkableInteger implements LinkedStack.Linkable {
    private int i;
    public LinkableInteger(int i) { this.i = i; }
    private LinkedStack.Linkable next;

    public LinkedStack.Linkable getNext() { return next; }

    public void setNext(LinkedStack.Linkable node) { next = node; }

    public int getI() { return i; }
}
