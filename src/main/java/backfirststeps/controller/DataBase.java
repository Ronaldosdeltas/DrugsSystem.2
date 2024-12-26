package backfirststeps.controller;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import backfirststeps.model.Itens;

public class DataBase {

    private Itens itens;

    public DataBase(){

    }
    public void register(Itens itens){
        try {
            OutputStream os = new FileOutputStream("medication.txt", true);
            OutputStreamWriter ws = new OutputStreamWriter(os);
            BufferedWriter yu = new BufferedWriter(ws);

            String line = itens.getName()+","+ itens.getAmount()+","+ itens.getType();

            yu.write(line);
            yu.newLine();
            yu.close();
            ws.close();
            os.close();
        System.out.println("Your medication"+itens.getName()+" was registed.");
        }catch (Exception e){
            System.out.println("Medication not registered");
            System.out.println(e);
        }

    }

    public void editer(int code){

    }
    public void search(int code){

    }

    public void delete(int code){

    }

}
