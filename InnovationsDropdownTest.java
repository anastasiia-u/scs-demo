import org.junit.Test;
import static org.junit.Assert.*;

public class InnovationsDropdownTest {

    @Test
    public void testInnovationsDropdownPresence() {
        HarmanHomePage homePage = new HarmanHomePage(driver);
        assertTrue("The innovations dropdown is not present", homePage.isInnovationsDropdownPresent());
    }

    @Test
    public void testInnovationsDropdownOptions() {
        HarmanHomePage homePage = new HarmanHomePage(driver);
        homePage.clickInnovationsDropdown();
        assertTrue("The dropdown options are incorrect", homePage.isDropdownOptionsCorrect());
    }
}