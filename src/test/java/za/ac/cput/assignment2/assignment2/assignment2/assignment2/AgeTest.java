package za.ac.cput.assignment2.assignment2.assignment2.assignment2;
/*
 * @Author
 *Full Name: Nikitha Mbokotwana
 * Student Number: 218337906
 * This is a test class for List
 */

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {

    List<String> years = new ArrayList<>();

    @Test
    void testAdd()
            //Add List
    {
            years.add("2");
            years.add("12");
            years.add("5");
            years.add("9");
            years.add("13");

        //test case add list
        assertEquals(5, years.size());
        System.out.println(years.toString());
    }


    @Test
    void testRemove()
    //Add remove method
    {
            years.add("2");
            years.add("12");
            years.add("5");
            years.add("9");
            years.remove("13");

        //Remove test case
        assertEquals(4, years.size());
        System.out.println("Update of Pet list: " + years.toString());
    }



    @Test
    void testSearchThrough()
    {
        //Add find
        for(int i = 0; i < 5; i++)
        {
            years.add("2");
            years.add("12");
            years.add("5");
            years.add("9");
            years.add("13");
        }
        //test case find
        assertTrue(years.contains("2"));
        System.out.println("Years found: " + years.contains("2"));
    }



}