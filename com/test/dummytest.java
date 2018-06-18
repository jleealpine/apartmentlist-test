package com.test;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by jasonlee on 5/18/18.
 */
public class dummytest {
    public static void main(String[] args) {

        dummytest dt = new dummytest();
        List<String> listOfPeople = new ArrayList<String>();


        listOfPeople.add("adam");
        listOfPeople.add("aaron");
        listOfPeople.add("axle");
        listOfPeople.add("bob");
        listOfPeople.add("billy");
        listOfPeople.add("chris");
        listOfPeople.add("dan");
        listOfPeople.add("eddie");
        listOfPeople.add("eric");
        listOfPeople.add("erin");

        List<List<String>> finalLists = dt.generateGroups(listOfPeople);

        System.out.println(finalLists);

    }

    public List<List<String>> generateGroups(List<String> peopleList) {

        int groups = peopleList.size() / 3;

        List<List<String>> listOfList = new ArrayList<List<String>>();
        for (int x = 0; x < groups; x++) {
            listOfList.add(new ArrayList<String>());
        }

        int counter = 0;

        while(peopleList.size() > 0) {
            double random = Math.random();
            int peopleLeft = peopleList.size();
            int personToGet = (int)Math.floor(peopleLeft * random);

            String person = peopleList.remove(personToGet);
            listOfList.get(counter).add(person);
            counter = (counter + 1) % groups;
        }
        return listOfList;

    }

}
