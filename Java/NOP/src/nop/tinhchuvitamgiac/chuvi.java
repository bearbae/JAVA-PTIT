/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nop.tinhchuvitamgiac;



public class chuvi {
    private double x,y;
    
    public chuvi(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public double distance(chuvi p1)
    {
        return Math.sqrt(Math.pow(Math.abs(x-p1.x),2)+Math.pow(Math.abs(y-p1.y),2));
    }
}

