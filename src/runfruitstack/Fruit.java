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
public class Fruit {
    private String fruit_id, name;
    private double unit_price;
    private int volume_sold;

    public Fruit(String fruit_id, String name, double unit_price, int volume_sold) {
        this.fruit_id = fruit_id;
        this.name = name;
        this.unit_price = unit_price;
        this.volume_sold = volume_sold;
    }

    public String getFruit_id() {
        return fruit_id;
    }

    public String getName() {
        return name;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public int getVolume_sold() {
        return volume_sold;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruit_id=" + fruit_id + ", name=" + name + ", unit_price=" + unit_price + ", volume_sold=" + volume_sold + '}';
    }
    
}
