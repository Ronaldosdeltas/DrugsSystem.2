package backfirststeps.controller;
import java.io.*;

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
        System.out.println("Your medication "+itens.getName()+" was registered.");
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
    public void read(){
        try {
            InputStream is = new FileInputStream("medication.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();

            while(line!= null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (Exception e){
            System.out.println("the file Couldn't be red." );
        }

    }

}
