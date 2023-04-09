package by.pvt.lessonten;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {

        Saper[] sapers = new Saper[3];
        sapers[0] = new Saper();
        sapers[1] = new Saper();
        sapers[2] = new Saper();
        Cooker[] cookers = new Cooker[3];
        cookers[0] = new Cooker();
        cookers[1] = new Cooker();
        cookers[2] = new Cooker();
        Builder[] builders = new Builder[3];
        builders[0] = new Builder();
        builders[1] = new Builder();
        builders[2] = new Builder();

        Saper saper1 = new Saper();
        Saper saper2 = new Saper();
        Saper saper3 = new Saper();
        Cooker cooker1 = new Cooker();
        Cooker cooker2 = new Cooker();
        Cooker cooker3 = new Cooker();
        Builder builder1 = new Builder();
        Builder builder2 = new Builder();
        Builder builder3 = new Builder();

        Exhibition1 exhibition1 = new Exhibition1(sapers, cookers, builders);
        exhibition1.getSapersExhibitions(saper1);
        exhibition1.getSapersExhibitions(saper2);
        exhibition1.getSapersExhibitions(saper3);
        exhibition1.getCookersExhibitions(cooker1);
        exhibition1.getCookersExhibitions(cooker2);
        exhibition1.getCookersExhibitions(cooker3);
        exhibition1.getBuildersExhibitions(builder1);
        exhibition1.getBuildersExhibitions(builder2);
        exhibition1.getBuildersExhibitions(builder3);
        System.out.println(Arrays.toString(exhibition1.getSapers()));
        System.out.println(Arrays.toString(exhibition1.getCookers()));
        System.out.println(Arrays.toString(exhibition1.getBuilders()));
        exhibition1.uniquePositions();
        System.out.println("***********************");

        Exhibition2 exhibition2 = new Exhibition2(sapers, cookers, builders);
        exhibition2.getSapersExhibitions(saper1);
        exhibition2.getSapersExhibitions(saper2);
        exhibition2.getSapersExhibitions(saper3);
        exhibition2.getCookersExhibitions(cooker1);
        exhibition2.getCookersExhibitions(cooker2);
        exhibition2.getCookersExhibitions(cooker3);
        exhibition2.getBuildersExhibitions(builder1);
        exhibition2.getBuildersExhibitions(builder2);
        exhibition2.getBuildersExhibitions(builder3);
        System.out.println(Arrays.toString(exhibition2.getSapers()));
        System.out.println(Arrays.toString(exhibition2.getCookers()));
        System.out.println(Arrays.toString(exhibition2.getBuilders()));
        exhibition2.uniquePositions();
        System.out.println("***********************");

        Exhibition3 exhibition3 = new Exhibition3(sapers, cookers, builders);
        exhibition3.getSapersExhibitions(saper1);
        exhibition3.getSapersExhibitions(saper2);
        exhibition3.getSapersExhibitions(saper3);
        exhibition3.getCookersExhibitions(cooker1);
        exhibition3.getCookersExhibitions(cooker2);
        exhibition3.getCookersExhibitions(cooker3);
        exhibition3.getBuildersExhibitions(builder1);
        exhibition3.getBuildersExhibitions(builder2);
        exhibition3.getBuildersExhibitions(builder3);
        System.out.println(Arrays.toString(exhibition3.getSapers()));
        System.out.println(Arrays.toString(exhibition3.getCookers()));
        System.out.println(Arrays.toString(exhibition3.getBuilders()));
        exhibition3.uniquePositions();

    }
}
