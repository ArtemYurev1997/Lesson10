package by.pvt.lessonten;

public class Saper implements RobotEngineer {
    private String model;
    private int power;
    private String powerUnit;
    private String country;
    private String deminingAgent;
    private int numberChassis;
    private String material;
    private boolean isSwitch;


    @Override
    public void create() {
        model = "F-300";
        power = 3000;
        powerUnit = "Automatic";
        country = "Belarus";
        deminingAgent = "Catcher";
        numberChassis = 7;
        material = "Metal";
        isSwitch = true;
    }


    @Override
    public String toString() {
        return "Saper{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", powerUnit='" + powerUnit + '\'' +
                ", country='" + country + '\'' +
                ", deminingAgent='" + deminingAgent + '\'' +
                ", numberChassis=" + numberChassis +
                ", material='" + material + '\'' +
                ", isSwitch=" + isSwitch +
                '}';
    }

    @Override
    public void repair() {

    }

    @Override
    public void replaceAggregate(String aggregate) {
        if(!isSwitch) {
            System.out.println("Aggregate replace");
        }
        else {
            System.out.println("Aggregate doesn't replace");
        }
        deminingAgent = aggregate;
    }

    @Override
    public void onRobot() {
        if(isSwitch) {
            System.out.println("Robot on");
        }
    }

    @Override
    public void offRobot() {
        if(!isSwitch) {
            System.out.println("Robot off");
        }
    }

    @Override
    public void uniquePossibility () {
        System.out.println("Robot mining");
    }

    @Override
    public void reset() {

    }
}
