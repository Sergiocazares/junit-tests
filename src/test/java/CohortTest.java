import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortOfOne;
    Cohort cohortOfMany;

    @Before
    public void setUp(){
        cohortOfOne = new Cohort();
        emptyCohort = new Cohort();
        cohortOfMany = new Cohort();

        Student sergio = new Student(12L, "Sergio");
        Student meilyn = new Student(13L, "Meilyn");
        Student andy = new Student(14L, "Andy");
        Student evelyn = new Student(15L, "Evelyn");

        cohortOfOne.addStudent(sergio);

        cohortOfMany.addStudent(meilyn);
        cohortOfMany.addStudent(andy);
        cohortOfMany.addStudent(evelyn);

        meilyn.addGrade(70);
        meilyn.addGrade(70);
        andy.addGrade(90);
        andy.addGrade(90);
        evelyn.addGrade(80);
        evelyn.addGrade(80);

    }

    @Test
    public void testAddStudent(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortOfOne.getStudents().size());
    }

    @Test
    public void testGetStudents(){
        assertEquals("Evelyn", cohortOfMany.getStudents().get(2).getName());
        assertEquals("Sergio", cohortOfOne.getStudents().get(0).getName());
    }

    @Test
    public void testGetCohortAverage(){
        assertEquals(80, cohortOfMany.getCohortAverage(), 0);

    }
}