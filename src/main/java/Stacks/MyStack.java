package Stacks;

import java.util.NoSuchElementException;

public class MyStack <T> {
    public SNode<T> botton;
    public SNode<T> top;
    int size;
    public boolean isEmpty(){
        return botton==null;
    }
    public void push(T item){
        SNode<T> node=new SNode<>(item);
        if (isEmpty()) botton=top=node;
        else {
            top.next=node;
            top=node;
        }
        size++;
    }

    public T peek(){
        return(T) top.value;
    }

    public T pop() {
        SNode peekNode;
        if (isEmpty()) throw new NoSuchElementException();
        //stack has one element
        if (top == botton) {
            peekNode = top;
            top = botton = null;

        } else {//more than one element
            peekNode = top;
            SNode prev = botton;
            while (prev.next != top) {
               prev= prev.next;
            }

            prev.next=null;
            top=prev;
        }
        size--;
        return (T) peekNode.value;
        }


    }
