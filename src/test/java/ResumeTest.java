import org.junit.*;
import static org.junit.Assert.*;

public class ResumeTest{

    @Test 
    public void resume_instantiatesCorrectly_true() {
        Resume resume = new Resume("Intern", "Google", "Kariamburi", "Trained on algorithm", "17th March 2010", "17th December 2010");
        assertEquals(true, resume instanceof Resume);
    }

    @Test 
    public void resume_instantiatesWithTitle_String() {
        Resume resume = new Resume("Intern", "Google", "Kariamburi", "Trained on algorithm", "17th March 2010", "17th December 2010");
        assertEquals("Intern", resume.getTitle());
    }

    @Test 
    public void resume_instantiatesWithCompany_String() {
        Resume resume = new Resume("Intern", "Google","Kariamburi", "Trained on algorithm", "17th March 2010", "17th December 2010");
        assertEquals("Google", resume.getCompany());
    }

    @Test 
    public void resume_instantiatesWithLocation_String() {
        Resume resume = new Resume("Intern", "Google", "Kariamburi", "Trained on algorithm", "17th March 2010", "17th December 2010");
        assertEquals("Kariamburi", resume.getLocation());
    }

    @Test 
    public void resume_instantiatesWithDescription_String() {
        Resume resume = new Resume("Intern", "Google", "Kariamburi", "Trained on algorithm", "17th March 2010", "17th December 2010");
        assertEquals("Trained on algorithm", resume.getDescription());
    }

    @Test 
    public void resume_instantiatesWithDate_String() {
        Resume resume = new Resume("Intern", "Google", "Kariamburi", "Trained on algorithm", "17th March 2010", "17th December 2010");
        assertEquals("17th March 2010", resume.getDate());
    }

     @Test 
    public void resume_instantiatesWithEnd_String() {
        Resume resume = new Resume("Intern", "Google", "Kariamburi", "Trained on algorithm", "17th March 2010", "17th December 2010");
        assertEquals("17th December 2010", resume.getEnd());
    }
}