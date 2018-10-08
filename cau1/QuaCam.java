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
public class QuaCam extends HoaQua{
    private String origin;
    private String size;

    public String getOrigin() {
        return origin;
    }

    public String getSize() {
        return size;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public QuaCam(String origin, String size, String name, String color, String taste) {
        super(name, color, taste);
        this.origin = origin;
        this.size = size;
    }
}
