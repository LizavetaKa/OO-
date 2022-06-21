package com.company;

public class AllProcess {
    private Fridge fridge;
    private Cut cut;
    private Kitchen kitchen;

    public AllProcess(Fridge fridge, Cut cut, Kitchen kitchen)
    {
        this.fridge = fridge;
        this.cut = cut;
        this.kitchen = kitchen;
    }

    public void CutProduct(String product)
    {
        fridge.Open();
        fridge.Take(product);
        fridge.Close();
        kitchen.Take();
        cut.Cutting(product);
        kitchen.Clean();
    }
}
