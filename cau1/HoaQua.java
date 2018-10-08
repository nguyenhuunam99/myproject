/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author Admin
 */
public class HoaQua {

    private String name;
    private String color;
    private String taste;

    public HoaQua(String name, String color, String taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String a) {
        name = a;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
