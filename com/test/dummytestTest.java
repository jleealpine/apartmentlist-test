package com.test;

//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert;

/**
 * Created by jasonlee on 6/18/18.
 */
//@RunWith(Arquillian.class)
public class dummytestTest {
//    @org.junit.Test
//    public void main() throws Exception {
//    }

    @org.junit.Test
    public void generateGroups() throws Exception {
        dummytest dt = new dummytest();

        // test that each list is between groups of three and five

        List<String> listOfPeople = new ArrayList<String>();
        for (int x = 0; x < 100; x++) {
            listOfPeople.add("person" + x);
        }

        List<List<String>> generateGroupResult = dt.generateGroups(listOfPeople);

        for (int z = 0; z < 10; z++) {
            for (int y = 0; y < generateGroupResult.size(); y++) {
                List<String> group = generateGroupResult.get(y);
                junit.Assert.assertTrue(group.size() >= 3);
                junit.Assert.assertTrue(group.size() <= 5);
            }
        }
    }

//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(dummytest.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }

}
