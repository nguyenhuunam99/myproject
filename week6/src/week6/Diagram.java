/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author CCNE
 */
public class Diagram {
    Layer x=new Layer();
    public void removecircle()
    {
        for(int i=0;i<x.layer.size();i++)
        {
            if(x.layer.get(i) instanceof Circle)
            {
                x.layer.remove(i);
                i--;
            }
        }
    }
}
