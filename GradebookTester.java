import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
    GradeBook grade;

	@BeforeEach
	void setUp() throws Exception {
		grade = new GradeBook(5);
		grade.addScore(20.0);
		grade.addScore(40.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		grade = null;
		
	}

	@Test
	void testAddScore() {
		assertEquals(2.0, grade.getScoreSize(), .00001);
	}

	@Test
	void testSum() {
		assertEquals(60.0, grade.sum(), .00001);
	}

	@Test
	void testMinimum() {
		assertEquals(20.0, grade.minimum(), .00001);
	}
	@Test

    public void testFinalScore()
    {
		assertEquals(40.0, grade.finalScore(), .00001);
    }
}
