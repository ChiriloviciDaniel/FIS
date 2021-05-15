
package proiect;
class comenzi {
    private String hdd,plaV,plaB,pr,adr,tel;
    public comenzi(String hdd,String plaV,String plaB,String pr,String adr,String tel){
        this.hdd=hdd;
        this.plaV=plaV;
        this.plaB=plaB;
        this.pr=pr;
        this.adr=adr;
        this.tel=tel;
        
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getPlaV() {
        return plaV;
    }

    public void setPlaV(String plaV) {
        this.plaV = plaV;
    }

    public String getPlaB() {
        return plaB;
    }

    public void setPlaB(String plaB) {
        this.plaB = plaB;
    }

    public String getPr() {
        return pr;
    }

    public void setPr(String pr) {
        this.pr = pr;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
