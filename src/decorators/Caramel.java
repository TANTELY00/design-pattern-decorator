package decorators;

import boisons.Boison;

public class Caramel extends Decorateur{

    public Caramel(Boison boison) {
        super(boison);
    }

    @Override
    public double cout() {
        return boison.cout()+3;
    }

    @Override
    public String getDescription() {
        return boison.getDescription()+" au caramel";
    }
}
