package backfirststeps;

import backfirststeps.controller.DataBase;
import backfirststeps.model.Itens;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        DataBase dataBase = new DataBase();
        ArrayList<Itens> itens = dataBase.read();

        for(int i =0; i< itens.size(); i++){
            System.out.println("Code:"+i+"-Name:"+itens.get(i).getName()+"Amount"+itens.get(i).getAmount()+"Type"+itens.get(i).getType());
        }

    }

}