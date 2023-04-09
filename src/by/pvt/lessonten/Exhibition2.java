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

    public void getSapersExhibitions(Saper saper) {
        int numOfLength = sapers.length;
        if(numOfLength == 0) {
            sapers = new Saper[1];
            sapers[0] = saper;
        }
        else {
            Saper[] copySapers = new Saper[sapers.length];
            for(int i =0; i < sapers.length; i++) {
                if(i != sapers.length) {
                    copySapers[i] = sapers[i];
                }
                else {
                    copySapers[i] = saper;
                }
            }
            sapers = copySapers;
        }
    }

    public void getCookersExhibitions(Cooker cooker) {
        int numOfLength = cookers.length;
        if(numOfLength == 0) {
            cookers = new Cooker[1];
            cookers[0] = cooker;
        }
        else {
            Cooker[] copyCookers = new Cooker[cookers.length];
            for(int i =0; i < cookers.length; i++) {
                if(i != cookers.length) {
                    copyCookers[i] = cookers[i];
                }
                else {
                    copyCookers[i] = cooker;
                }
            }
            cookers = copyCookers;
        }
    }

    public void getBuildersExhibitions(Builder builder) {
        int numOfLength = builders.length;
        if(numOfLength == 0) {
            builders = new Builder[1];
            builders[0] = builder;
        }
        else {
            Builder[] copyBuilders = new Builder[builders.length];
            for(int i =0; i < builders.length; i++) {
                if(i != builders.length) {
                    copyBuilders[i] = builders[i];
                }
                else {
                    copyBuilders[i] = builder;
                }
            }
            builders = copyBuilders;
        }
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
