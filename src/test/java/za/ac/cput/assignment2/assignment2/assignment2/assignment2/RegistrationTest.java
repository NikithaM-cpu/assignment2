package za.ac.cput.assignment2.assignment2.assignment2.assignment2;
/*
 * @Author
 *Full Name: Nikitha Mbokotwana
 * Student Number: 218337906
 * This is a test class for main/COLLECTION
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    Collection<Registration> petCollection = new ArrayList<>();

    @Test
    void testAdd(){


        for (int i = 0; i < 5; i++)
        {
            String petTypes = "d" + 1;
            int uniqueNumber = 1;
            Registration r = new Registration(petTypes);
            petCollection.add(r);

        }
          //Test case for add
           assertEquals(5, petCollection.size());

    }

    @Test
    void testRemove()
    {
        String petTypes = "d" + 1;
        int uniqueNumber = 1;
        Registration r = new Registration(petTypes);
        petCollection.remove(r);

        //Test case for remove
        assertEquals(4, petCollection.size());

    }

    @Test
    void testSearchThrough()
    {
        String petTypes = "d" + 1;
        int uniqueNumber = 1;
        Registration r = new Registration(petTypes);
        petCollection.add(r);

        //Test case for find
        assertTrue(petCollection.contains(petTypes));
        System.out.println("Years found: " + petCollection.contains(petTypes));
    }





}