package backfirststeps;

import backfirststeps.controller.DataBase;
import backfirststeps.model.Itens;

public class Main {
    public static void main(String[] args) {

        Itens ibrupofeno= new Itens(2,"Ibrupofeno 200mg",40,"box");
        Itens paracetamol = new Itens(2,"Paracetamol 100mg",20,"gota");

        DataBase dataBase = new DataBase();
        dataBase.register(ibrupofeno);
        dataBase.register(paracetamol);
    }

}