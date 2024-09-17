package decorators;

import boisons.Boison;

public abstract class Decorateur extends Boison{
    protected  Boison boison;

    public Decorateur(Boison boison) {
        this.boison = boison;
    }

    public abstract String getDescription();
}
