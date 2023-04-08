package by.pvt.lessonten;

public class Cooker implements Robot{
    private String model;
    private int power;
    private String  powerUnit;
    private String country;
    private String aggregateForWork;
    private int numberMaterial;
    private String material;
    private boolean isSwitch;


    @Override
    public String toString() {
        return "Cooker{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", powerUnit='" + powerUnit + '\'' +
                ", country='" + country + '\'' +
                ", aggregateForWork='" + aggregateForWork + '\'' +
                ", numberMaterial=" + numberMaterial +
                ", material='" + material + '\'' +
                ", isSwitch=" + isSwitch +
                '}';
    }

    @Override
    public void create() {
        model = "F-301";
        power = 2900;
        powerUnit = "Automatic";
        country = "Belarus";
        aggregateForWork = "Catcher";
        numberMaterial = 2;
        material = "Metal";
        isSwitch = true;

    }

    @Override
    public void repair() {

    }

    @Override
    public void replaceAggregate(String aggregate) {
        aggregateForWork = aggregate;
    }

    @Override
    public void onRobot() {

    }

    @Override
    public void offRobot() {

    }

    @Override
    public void uniquePossibility () {
        System.out.println("Robot cooking");
    }
}
