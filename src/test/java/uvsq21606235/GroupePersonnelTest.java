package uvsq21606235;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;


public class GroupePersonnelTest {

	@Test
	public void testAdd() {
		GroupePersonnel gp = new GroupePersonnel();
		gp.add(new GroupePersonnel());
		Iterator<PersonnelInterface> ip = gp.iterator();
		assertFalse(!ip.hasNext());
	}
	
	@Test
	public void testDelete() {
		GroupePersonnel gp = new GroupePersonnel();
		GroupePersonnel gp1 = new GroupePersonnel();
		gp.add(gp1);
		gp.delete(gp1);
		Iterator<PersonnelInterface> p = gp.iterator();
		assertTrue(!p.hasNext());
	}
}
