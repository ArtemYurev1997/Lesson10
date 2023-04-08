package by.pvt.lessonten;

public class Builder implements  RobotEngineer {
    private String model;
    private int power;
    private String powerUnit;
    private String country;
    private String aggregateForBuilding;
    private String material;
    private boolean isSwitch;



    @Override
    public void create() {
        model = "F-302";
        power = 3500;
        powerUnit = "Automatic";
        country = "Belarus";
        aggregateForBuilding = "Tap";
        material = "Metal";
        isSwitch = true;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", powerUnit='" + powerUnit + '\'' +
                ", country='" + country + '\'' +
                ", aggregateForBuilding='" + aggregateForBuilding + '\'' +
                ", material='" + material + '\'' +
                ", isSwitch=" + isSwitch +
                '}';
    }

    @Override
    public void repair() {

    }

    @Override
    public void replaceAggregate(String aggregate) {
        aggregateForBuilding = aggregate;
    }

    @Override
    public void onRobot() {

    }

    @Override
    public void offRobot() {

    }

    @Override
    public void uniquePossibility () {
        System.out.println("Robot building");
    }

    @Override
    public void reset() {

    }
}
