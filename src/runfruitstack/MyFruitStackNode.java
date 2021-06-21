/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runfruitstack;

/**
 *
 * @author A. Mjeks
 */
public class MyFruitStackNode {
    private Fruit value;
    private MyFruitStackNode next;

    public MyFruitStackNode() {
        value = null;
        next = null;
    }

    public void setValue(Fruit value) {
        this.value = value;
    }

    public void setNext(MyFruitStackNode next) {
        this.next = next;
    }
        
    public Fruit getValue() {
        return value;
    }

    public MyFruitStackNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "MyFruitStackNode{" + "value=" + value + ", next=" + next + '}';
    } 
   
}
