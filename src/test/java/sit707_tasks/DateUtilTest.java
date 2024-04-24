package sit707_tasks;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author Deepak Kumar Khatri
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "220007878";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Deepak Kumar Khatri";
		Assert.assertNotNull("Student name is null", studentName);
	}

// Equivalence classes for Day (D1, D2, D3, D4)
    
    @Test
    public void testD1NormalDayIncrement() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
    }
    
    @Test
    public void testD1NormalDayDecrement() {
        DateUtil date = new DateUtil(2, 1, 2024);
        date.decrement();
        Assert.assertEquals(1, date.getDay());
    }
    
    @Test
    public void testD2FebruaryNonLeapYearBoundaryIncrement() {
        DateUtil date = new DateUtil(28, 2, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }
    
    @Test
    public void testD2FebruaryNonLeapYearBoundaryDecrement() {
        DateUtil date = new DateUtil(1, 3, 2023);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    @Test
    public void testD2FebruaryLeapYearBoundaryIncrement() {
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    @Test
    public void testD2FebruaryLeapYearBoundaryDecrement() {
        DateUtil date = new DateUtil(1, 3, 2024);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    @Test
    public void testD3ThirtyDayBoundaryIncrement() {
        DateUtil date = new DateUtil(30, 4, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }
    
    @Test
    public void testD3ThirtyDayBoundaryDecrement() {
        DateUtil date = new DateUtil(1, 5, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }
    
    @Test
    public void testD4ThirtyOneDayBoundaryIncrement() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    @Test
    public void testD4ThirtyOneDayBoundaryDecrement() {
        DateUtil date = new DateUtil(1, 2, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }
    
    
    // Equivalence classes for Month (M1, M2, M3, M4)
    
    @Test
    public void testM1AprilLastDayIncrement() {
        DateUtil date = new DateUtil(30, 4, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }
    
    @Test
    public void testM1AprilFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 4, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }
    
    @Test
    public void testM1JuneLastDayIncrement() {
        DateUtil date = new DateUtil(30, 6, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
    }
    
    @Test
    public void testM1JuneFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 6, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }
    
    @Test
    public void testM1SeptemberLastDayIncrement() {
        DateUtil date = new DateUtil(30, 9, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(10, date.getMonth());
    }
    
    @Test
    public void testM1SeptemberFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 9, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(8, date.getMonth());
    }
    
    @Test
    public void testM1NovemberLastDayIncrement() {
        DateUtil date = new DateUtil(30, 11, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }
    
    @Test
    public void testM1NovemberFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 11, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(10, date.getMonth());
    }
    
    @Test
    public void testM2JanuaryLastDayIncrement() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    @Test
    public void testM2JanuaryFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }
    
    // Add other test cases for M2
    
    @Test
    public void testM2DecemberLastDayIncrement() {
        DateUtil date = new DateUtil(31, 12, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testM2DecemberFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 12, 2023);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    
    @Test
    public void testM3FebruaryNormalYearLastDayIncrement() {
        DateUtil date = new DateUtil(28, 2, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }
    
    @Test
    public void testM3FebruaryNormalYearFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 2, 2023);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }
    
    @Test
    public void testM4FebruaryLeapYearLastDayIncrement() {
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment();
        Assert.assertEquals(29, date.getDay());
    }
    
    @Test
    public void testM4FebruaryLeapYearFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 2, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }
    
    // Equivalence classes for Year (Y1, Y2)
    
    @Test
    public void testY1NormalYearDecemberLastDayIncrement() {
        DateUtil date = new DateUtil(31, 12, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testY1NormalYearJanuaryFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    
    @Test
    public void testY2LeapYearDecemberLastDayIncrement() {
        DateUtil date = new DateUtil(31, 12, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2025, date.getYear());
    }
    
    @Test
    public void testY2LeapYearJanuaryFirstDayDecrement() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
}
