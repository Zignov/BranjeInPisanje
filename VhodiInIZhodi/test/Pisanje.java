package test;

import java.nio.file.*;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Pisanje{
    public static void main(String[]args){
        //dodamo pot datoteke kjer zelimo pisati

        Path pot = Paths.get("top10igralci.csv");

        //Dolocimo izhodni tok za pisanje znakov
        //OutputStream, Writer, FileOutPutStream

        ArrayList<Igralec> igralci = new ArrayList<Igralec>();

        igralci.add(new Igralec("Kareem","Abdul-Jabbar","New York",38387));
        igralci.add(new Igralec("LeBron","James","Ohio",35782));



        try (Writer w = Files.newBufferedWriter(pot, StandardCharsets.UTF_8, StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
            
            PrintWriter pw = new PrintWriter(w);
            pw.println("Ime, priimek, mesto, tocek");

            for (Igralec igralec : igralci){
                pw.println(String.join(",", new String[]{
                    igralec.getIme(),
                    igralec.getPriimek(),
                    igralec.getDrzava(),
                    igralec.getToccke() + " "
                }));
            }
            //pw.println();

        } catch (IOException e){
            System.out.println(("Zgodila se je napaka: ") + e.getMessage());
        }




    }
}