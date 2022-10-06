package day34_inheritance;

public class S302 extends S_Model{

    protected String extraOzellik="Tablet ile gosterge kontrolu";

    @Override
    public String toString() {
        return "S302{" +
                "\nextraOzellik='" + extraOzellik +
                "\nsilindir=" + silindir +
                "\nsekment='" + sekment +
                "\nisim='" + isim +
                "\nmade='" + made +
                "\nmotorYeri='" + motorYeri
                ;
    }

    public static void main(String[] args) {
        S302 arb302=new S302();
        arb302.made="Fransa";
        System.out.println(arb302);
    }



}
