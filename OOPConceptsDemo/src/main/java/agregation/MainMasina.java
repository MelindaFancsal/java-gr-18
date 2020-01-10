package agregation;

public class MainMasina {

    public static void main(String[] args) {
        //masina vw de culoare alba cu motor capacitate 1 si putere 75
        //AFISAM MSG: Masina X are culoarea Y si motorul de putere Z si capacitate T

        Motor motorWV = new Motor();
        motorWV.setCapacitate(1);
        motorWV.setPutere(75);

       // System.out.println("MotorVW are puterea: " + motorWV.getPutere());
      //  System.out.println("MotorVW are capacitatea: " + motorWV.getCapacitate());

        Masina masinaVW = new Masina(motorWV, "VW");
        masinaVW.setCuloare("alb");

        System.out.println("Masina " + masinaVW.getNume()
                + " are culoarea " + masinaVW.getCuloare()
        + " si motorul de putere " + masinaVW.getMotor().getPutere()
        + " si capacitate : " + masinaVW.getMotor().getCapacitate());


        masinaVW = null;

        //chiar daca obiectul masina a fost distrus, obiectul motor inca exista
        //raspunde la intrebarea HAS A
    }
}
