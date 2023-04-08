package by.pvt.lessonten;

public class Exhibition3 {
    private Saper[] sapers;
    private Cooker[] cookers;
    private Builder[] builders;

    public Exhibition3(Saper[] sapers, Cooker[] cookers, Builder[] builders) {
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

    public void uniquePositions() {
        Object saperes = new Saper();
        if(saperes instanceof Saper) {
            for (Saper saper : sapers) {
                saper.uniquePossibility();
            }
        }

        Object cookeres = new Cooker();
        if(cookeres instanceof Saper) {
            for (Cooker cooker : cookers) {
                cooker.uniquePossibility();
            }
        }

        Object builderes = new Builder();
        if(builderes instanceof Saper) {
            for (Builder builder : builders) {
                builder.uniquePossibility();
            }
        }
    }
}
