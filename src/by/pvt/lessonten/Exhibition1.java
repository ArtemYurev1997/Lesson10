package by.pvt.lessonten;

public class Exhibition1 {
    private Saper[] sapers;
    private Cooker[] cookers;
    private Builder[] builders;

    public Exhibition1(Saper[] sapers, Cooker[] cookers, Builder[] builders) {
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
            for (Saper saper : sapers) {
                saper.uniquePossibility();
            }

            for (Cooker cooker : cookers) {
                cooker.uniquePossibility();
            }

            for (Builder builder : builders) {
                builder.uniquePossibility();
            }
    }
}
