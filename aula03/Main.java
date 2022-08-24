package com.timbuchalka.aula03;

public class Main {
    public static void main (String []args){
        System.out.println("PROGRAMA INICIADO \n");
        VipCostumer vipDefaultCostumer = new VipCostumer();
        VipCostumer vipAlmostDefaultCostumer = new VipCostumer("Eduardo", 999);
        VipCostumer vipFullCostumer = new VipCostumer("Eduardo", "Eduardo@mail.com", 123);

    }
}
