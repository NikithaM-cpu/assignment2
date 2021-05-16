package za.ac.cput.assignment2.assignment2.assignment2.assignment2;
/*
    * @Author
   *Full Name: Nikitha Mbokotwana
   * Student Number: 218337906
   * This is a test class for Set
 */
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    Set<String> petName = new HashSet<>();

    @Test
    void testAdd()
    {
        //Set add method
        Set<String> petName = new HashSet<>();
        for(int i = 0; i < 5; i++)
        {
            petName.add("Goofy");
            petName.add("Snoopy");
            petName.add("Flurry");
            petName.add("Dolly");
            petName.add("Tom");
        }

        //Test case for Add
        assertEquals(5, petName.size());
        System.out.println(petName.toString());
    }

    @Test
    void testRemove()
    //Set remove method
    {
        for(int i = 0; i < 4; i++)
        {
            petName.add("Goofy");
            petName.add("Snoopy");
            petName.add("Flurry");
            petName.add("Dolly");
            petName.remove("Tom");
        }

        //Test case for Set
        assertEquals(4, petName.size());
        System.out.println("Update of Pet list: " + petName.toString());
    }

    @Test
    void testSearchThrough()
    {
        //Add find for set
        for(int i = 0; i < 5; i++)
        {
            petName.add("Goofy");
            petName.add("Snoopy");
            petName.add("Flurry");
            petName.add("Dolly");
            petName.add("Tom");
        }
        //Set test case
        assertTrue(petName.contains("Tom"));
        System.out.println("Pet found: " + petName.contains("Tom"));
    }



}