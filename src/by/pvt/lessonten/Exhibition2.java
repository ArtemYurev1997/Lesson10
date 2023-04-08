package by.pvt.lessonten;

public class Exhibition2 {
    private Saper[] sapers;
    private Cooker[] cookers;
    private Builder[] builders;

    public Exhibition2(Saper[] sapers, Cooker[] cookers, Builder[] builders) {
        this.sapers = sapers;
        this.cookers = cookers;
        this.builders = builders;
    }

    public Saper[] getSapers() {
        return sapers;
    }

    public Cooker[] getCookers() {
        return cookers;
    }

    public Builder[] getBuilders() {
        return builders;
    }


    public  void uniquePositions() {
        Saper saperes = new Saper();
        if(saperes instanceof RobotEngineer) {
            for (Saper saper : sapers) {
                saper.uniquePossibility();
            }
        }

        Cooker cookeres = new Cooker();
        if(cookeres instanceof RobotEngineer) {
            for (Cooker cooker : cookers) {
                cooker.uniquePossibility();
            }
        }

        Builder builderes = new Builder();
        if(builderes instanceof RobotEngineer) {
            for (Builder builder : builders) {
                builder.uniquePossibility();
            }
        }
    }

}
