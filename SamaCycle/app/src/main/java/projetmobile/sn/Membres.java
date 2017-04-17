package projetmobile.sn;

/**
 * Created by SAMBA WARR on 02/02/2017.
 */

public class Membres {

    private int id;
    private int duree_cycle ;
    private int debut_regle;
    private String pseudo;
    public Membres(){}
    public Membres(int ident, int dur_c, int deb_r,String ps) {
        id = ident;
        duree_cycle = dur_c;
        debut_regle = deb_r;
        pseudo=ps;
    }

    public void setduree_cycle(int dur_c) {
        duree_cycle = dur_c;
    }

    public int getId() {
        return this.id;
    }

    public void setid(int ident) {
        id = ident;
    }

    public int getduree_cycle() {
        return this.duree_cycle;
    }

    public Integer getduree_regle() {
        return debut_regle;
    }

    public void setduree_regle(int dur_r) {
        debut_regle= dur_r;
    }

    public String getpseudo() {
        return this.pseudo;
    }

    public void setpseudo(String ps) {
        pseudo = ps;
    }

}
