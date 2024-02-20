package composition;

public class MainCladire {

    public static void main(String[] args) {
        Cladire cladireA = new Cladire("CBC");
        cladireA.getCamera().setMarire(100);
        cladireA.getCamera().setCuloare("rosu");
        System.out.println(cladireA.getNume() + " are o camera de culoare: " + cladireA.getCamera().getCuloare());
    }
}
