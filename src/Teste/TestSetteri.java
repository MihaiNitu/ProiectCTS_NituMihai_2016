package Teste;

import Clase.Distribuitor;
import Clase.Model;
import Clase.Telefon;
import Clase.ValoriIncorenteException;
import junit.framework.TestCase;

public class TestSetteri extends TestCase {
	Telefon tel;
	public TestSetteri(String string) {
		super(string);
	}
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	// Pentru valori normale pe setter
	@Test
	public void test_model1() throws ValoriIncorenteException{
	Model companie=new Model("ase");
	companie.setTip("Lumia");
	assertEquals("Nu se potriveste",companie.getTip(), "Lumia");
	}
	// Pentru valori normale
	@Test
	public void test_model2() throws ValoriIncorenteException{
	Model companie=new Model();
	companie.setTip("Lumia");
	assertEquals(companie.getTip(), "Lumia");
	}
	
	// Pentru valori prea mici(scurte)
	@Test
	public void test_model3() throws ValoriIncorenteException{
	Model companie=new Model();
	companie.setTip("GGG");
	assertEquals(companie.getTip(), "GGG");
	}
	
	// Pentru valori prea mari (lungi)
	@Test
	public void test_model4() throws ValoriIncorenteException{
	Model companie=new Model();
	companie.setTip("950");
	assertEquals(companie.getTip(), "950");
	}
	@Test
	public void test_model5() throws ValoriIncorenteException{
	Model companie=new Model("950");
	assertEquals(companie.getTip(), "950");
	}
	@Test
	public void test_model6() throws ValoriIncorenteException{
	Model companie = new Model("Lumia");
	assertNotNull("Nu este null", companie);
	}
	@Test
	public void test_model7() throws ValoriIncorenteException{
	Distribuitor dis = Distribuitor.creazaInstanta();
	dis.setAdresa("Bucuresti");
	assertEquals(dis.getAdresa(),"Bucuresti");
	}
	@Test
	public void test_model8() throws ValoriIncorenteException{
	Distribuitor dis = Distribuitor.creazaInstanta();
	dis.setAdresa(null);
	assertNull(dis.getAdresa());
	}
	// test pe constructor
	@Test
	public void test_model9() throws ValoriIncorenteException{
	Distribuitor dis = Distribuitor.creazaInstanta();
	assertEquals(dis.getDenumire(),"Microsoft");
	}
	@Test
	public void test_model10() throws ValoriIncorenteException{
	Distribuitor dis = Distribuitor.creazaInstanta();
	assertTrue(dis.getVechime()==23);
	}
	@Test
	public void test_model11() throws ValoriIncorenteException{
	Distribuitor dis = Distribuitor.creazaInstanta();
	assertFalse(dis.getVechime()<3);
	}
	@Test
	public void test_model12() throws ValoriIncorenteException{
	Distribuitor dis = Distribuitor.creazaInstanta();
	assertFalse(dis.getAdresa()=="Rahova");
	}
	
	@Test
	public void test_model13() throws ValoriIncorenteException{
	Distribuitor dis = Distribuitor.creazaInstanta();
	Distribuitor dis2 = Distribuitor.creazaInstanta();
	assertEquals(dis2, dis);
	}
	@Test
	public void test_model14() throws ValoriIncorenteException{
	Distribuitor dis = Distribuitor.creazaInstanta();
	assertEquals(dis.getVechime(), 23);
	}
	
}
