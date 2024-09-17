import boisons.Boison;
import boisons.Colombia;
import decorators.Caramel;
import decorators.Chocolat;

public class Main {
    public static void main(String[] args) {
        Boison b = new Colombia();
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        System.out.println("**************");
        b = new Caramel(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        System.out.println("**************");
        b = new Chocolat(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}