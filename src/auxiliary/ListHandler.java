package auxiliary;

/**
 * Created by WTC-Team on 24.04.2016.
 * Project WhatToCook
 */
/*
    ZAJMUJE SIĘ OBSŁUGA ILOŚCI I JEDNOSTEK, POŚREDNICZY MIĘDZY GUI A KLASĄ PRZEPISÓW
    Łączy się z MainWindow
 */
public class ListHandler {

    public ListHandler( String ingredient, String amount, String unit) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.unit = unit;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    String ingredient;
    String amount;
    String unit;
}
