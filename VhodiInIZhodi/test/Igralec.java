package test;

public class Igralec {
    private String ime;
    private String priimek;
    private String drzava;
    private int tocke;


    public Igralec(String ime, String priimek, String drzava, int tocke){
        this.ime = ime;
        this.priimek = priimek;
        this.drzava = drzava;
        this.tocke = tocke;
    }


    public String getPriimek(){
        return priimek;
    }       


    public String getIme(){
        return ime;
    }    


    public String getDrzava(){
        return drzava;
    }


    public int getToccke(){
        return tocke;
    }

}
