package ro.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static final int IN_AGE = 18;

    public static void main(String[] args) {

        String name = "Fast Track IT";

        for (int i = 0; i < 25; i++) {

            System.out.println(i + name);
        }

        int[] list = {1, 3, 7, 0, 9, -1};
        List<Integer> myList = new ArrayList<>(List.of(1, 3, 7, 0, 35, 9, -1));

        for (int nr : myList) {
            if(myList.contains(IN_AGE))

                break;
            if (isNotInAge(nr))
                continue;

            System.out.println(nr);
        }

    }

    private static boolean isNotInAge(int nr) {
        return nr < IN_AGE;
    }
    //CTRL+ALT+M
}