package auxiliary;

/**
 * Created by WTC-Team on 23.04.2016.
 * Project WhatToCook
 */
/*
    UŻYWANA DO PRZECHOWYWANIA ILOŚCI I JEDNOSTKI SKŁADNIKÓW W PRZEPISACH
    Łączy się z Recipe
 */
public class PairAmountUnit {
    public PairAmountUnit(String amount,String unit)
    {
       this.amount = amount;
        this.unit = unit;
    }
    public String getAmount()
    {
        return amount;
    }
    public String getUnit()
    {
        return unit;
    }
    String amount;
    String unit;
}
