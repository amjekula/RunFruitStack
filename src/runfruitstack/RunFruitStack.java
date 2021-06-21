/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runfruitstack;

import java.util.UUID;

/**
 *
 * @author A. Mjeks
 */
public class RunFruitStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fruit_id = UUID.randomUUID().toString();
        MyFruitStack stackNode = new MyFruitStack();
        
        Fruit fruit1 = new Fruit(fruit_id, "Peach", 12.44, 25);
        Fruit fruit2 = new Fruit(fruit_id, "Apple", 9.99, 5);
        Fruit fruit3 = new Fruit(fruit_id, "Orange", 11.20, 17);
        Fruit fruit4 = new Fruit(fruit_id, "Guava", 6.99, 3);
        
        System.out.println("Before Push: " + stackNode.isEmpty() );

        stackNode.push(fruit1);
        stackNode.push(fruit2);
        stackNode.push(fruit3);
        stackNode.push(fruit4);
        
        System.out.println("After Push: " + stackNode.isEmpty());
        System.out.println("\nPeek Topmost Stack Item: " + stackNode.peek()+ "\n");
        
        for(int x = 0; x < 4; x++){
            System.out.println(stackNode.pop().toString());
        }
    }
    
}
