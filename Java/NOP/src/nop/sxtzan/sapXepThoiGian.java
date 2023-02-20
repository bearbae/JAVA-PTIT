


package nop ; 

/**
 *
 * @author HUY TRAN
 */
public class sapXepThoiGian {
    private int gio,phut,giay;

    public sapXepThoiGian() {
    }

    public sapXepThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }


   
    @Override
    public String toString(){
        return this.gio+" "+this.phut+" "+this.giay;
    }
}

