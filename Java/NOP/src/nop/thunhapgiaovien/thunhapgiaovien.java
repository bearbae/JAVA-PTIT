/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nop;


public class thunhapgiaovien {
    private String cv;
    private String ten;
    private long lcb;
    private int ma,hsl;
    private long tongluong;
    private int phucap;
    
    public thunhapgiaovien (){
    }
    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLcb() {
        return lcb;
    }

    public void setLcb(long lcb) {
        this.lcb = lcb;
    }

    public int getHsl() {
        return hsl;
    }

    public void setHsl() {
        hsl=(int)(cv.charAt(2)-'0')*10+(int)(cv.charAt(3)-'0');
    }

    public long getTongluong() {
        return lcb*hsl+phucap;
    }

    public void setTongluong() {
        tongluong=lcb*hsl+phucap;
    }

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap() {
        if (cv.charAt(1)=='T') phucap=2000000;
        else if (cv.charAt(1)=='P') phucap=900000;
        else phucap=500000;
    }

    @Override
    public String toString() {
        return cv+" " +ten+" "+hsl+" "+phucap+" "+tongluong;
    }
    
}
