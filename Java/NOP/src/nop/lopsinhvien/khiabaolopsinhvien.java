
package nop;

/**
 *
 * @author LOVE
 */

public class khiabaolopsinhvien {
    private String ht;
    private String lop;
    private String ns;
    private double gpa;
    
    public khiabaolopsinhvien()
    {
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "B20DCCN001" +" "+ht+" "+lop+" "+ns+" "+ String.format("%.2f",gpa );
    }
    
}
    
