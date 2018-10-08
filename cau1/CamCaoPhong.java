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
public class CamCaoPhong extends QuaCam {

    private int price;
    private int type;

    public CamCaoPhong(String origin, String size, String name, String color, String taste) {
        super(origin, size, name, color, taste);
    }

    public int getPrice() {
        return price;
    }

    public int getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(int type) {
        this.type = type;
    }

}
