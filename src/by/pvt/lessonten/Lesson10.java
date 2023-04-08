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

        Exhibition1 exhibition1 = new Exhibition1(sapers, cookers, builders);
        System.out.println(Arrays.toString(exhibition1.getSapers()));
        System.out.println(Arrays.toString(exhibition1.getCookers()));
        System.out.println(Arrays.toString(exhibition1.getBuilders()));
        exhibition1.uniquePositions();
        System.out.println("***********************");
        Exhibition2 exhibition2 = new Exhibition2(sapers, cookers, builders);
        System.out.println(Arrays.toString(exhibition2.getSapers()));
        System.out.println(Arrays.toString(exhibition2.getCookers()));
        System.out.println(Arrays.toString(exhibition2.getBuilders()));
        exhibition2.uniquePositions();
        System.out.println("***********************");
        Exhibition3 exhibition3 = new Exhibition3(sapers, cookers, builders);
        System.out.println(Arrays.toString(exhibition3.getSapers()));
        System.out.println(Arrays.toString(exhibition3.getCookers()));
        System.out.println(Arrays.toString(exhibition3.getBuilders()));
        exhibition3.uniquePositions();

    }
}
