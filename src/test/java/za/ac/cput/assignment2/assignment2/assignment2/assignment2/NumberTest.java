package za.ac.cput.assignment2.assignment2.assignment2.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberTest {

    Map<Integer, Registration> uniqueNumberMap = new HashMap<>();

    @Test
    void testAdd()
    //Add map method
    {
        for (int i = 0; i < 1; i++) ;
        {
            String petTypes = (String) "Cat";
            int uniqueNumber = 1;
            Registration Number = new Registration(petTypes, 1);
            uniqueNumberMap.put(1, Number);
            uniqueNumberMap.get(1);

        }
        //Test case map
        assertEquals(1, uniqueNumberMap.size());
        System.out.println(uniqueNumberMap.toString());

    }

    @Test
    void testRemove()
    //Add remove method
    {

            String petTypes = "Cat";
            Registration cat = new Registration(petTypes, 1);
            Registration dog = new Registration(petTypes, 1);
            Registration bird = new Registration(petTypes, 1);
            uniqueNumberMap.put(1, cat);
            uniqueNumberMap.put(1, dog);
            uniqueNumberMap.put(1, bird);
            uniqueNumberMap.remove(1, cat);

        //Test case remove method
        Assertions.assertEquals(1, uniqueNumberMap.size());
        System.out.println("Pet types: " + uniqueNumberMap.size());
    }

    @Test
    void testSearchThrough()
    {
        String petTypes = "Name" + 1;
        int uniqueNumber = 1;
        Registration Number = new Registration(petTypes, uniqueNumber);
        uniqueNumberMap.put(1, Number);

        //Test case find
        assertTrue(uniqueNumberMap.containsKey(1));
        System.out.println("Found: " + uniqueNumberMap.containsKey(1));

    }














}