package com.timbuchalka.aula03;

public class VipCostumer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCostumer(String name, String email, int creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
        System.out.println("\nVipCostumerFull Called\n");
    }
   
    public VipCostumer(String name, int creditLimit) {
        this(name,"EmailDefault", creditLimit);
        System.out.println("\nVipSemiCostumer Called\n");
    }
    
    public VipCostumer() {
        this("nameDefault", "EmailDefault", 00);
        System.out.println("\nVipDefaultCostumer Called\n");

    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    
}
