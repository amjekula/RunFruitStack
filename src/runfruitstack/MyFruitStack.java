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
public class MyFruitStack {
    private MyFruitStackNode data;
    
    public MyFruitStack(){
        data = null;
    }
    
    public void push(Fruit fruit){
        if(data == null){
            data = new MyFruitStackNode();
            data.setValue(fruit);
            data.setNext(null);
            
        }else{
            MyFruitStackNode temp = new MyFruitStackNode();
            temp.setValue(fruit);
            temp.setNext(data);
            data = temp;
        }
    }
    
    public boolean isEmpty(){
        if(data == null){ 
            return true;
            
        }else{
            return false;
        }
    }
    
    public Fruit peek(){
        return data.getValue();
    }
    
    public Fruit pop(){
        Fruit value = data.getValue();
        data = data.getNext();
        return value;
    }
}
