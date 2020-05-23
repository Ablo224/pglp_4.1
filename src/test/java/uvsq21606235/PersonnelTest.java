package uvsq21606235;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.ibm.icu.impl.locale.XLocaleMatcher.Builder;

public class PersonnelTest {

	
	@Test
	public void testConstructionPersonnel() {
		
		 ArrayList<String> num = new ArrayList<String>();
		 num.add("07-28-54-81-10");
		 num.add("09-10-15-00-00");
	     Personnel p = new Personnel.Builder("Ablo", "BAH", "Student", LocalDate.of(2000, 12, 12),num).build();
	     Assert.assertTrue(p != null);
	}

}
