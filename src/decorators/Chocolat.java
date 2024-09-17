package decorators;

import boisons.Boison;

public class Chocolat extends Decorateur{

    public Chocolat(Boison boison) {
        super(boison);
    }

    @Override
    public double cout() {
        return boison.cout()+5;
    }

    @Override
    public String getDescription() {
        return boison.getDescription()+" au chocolat";
    }
}
