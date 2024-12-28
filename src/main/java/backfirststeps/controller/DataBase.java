package backfirststeps.controller;
import java.io.*;
import java.util.ArrayList;

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
    public ArrayList<Itens> read(){
        try {
            InputStream is = new FileInputStream("medication.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();
            ArrayList<String> lines = new ArrayList<>();

            while(line!= null){
                System.out.println(line);
                line = br.readLine();
            }

            System.out.println("The file was read successfuly.");

            ArrayList<Itens> itens = new ArrayList<>();
            Itens iten;
            String[] elements = new String[3];

            for(int i= 0;i< lines.size(); i++){
                elements = lines.get(i).split(",");
                int amount = Integer.parseInt(elements[1]);
                iten = new Itens(elements[0],amount,elements[2]);
                itens.add(iten);
            }

            System.out.println("Lines converted to object sucessfully.");
            return itens;
        }catch (Exception e){
            System.out.println("the file Couldn't be read." );
            return null;
        }

    }

}
