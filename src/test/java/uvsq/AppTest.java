package uvsq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testPersonnel() {
    	
    	Personnel p = new Personnel.Builder("Smith", "John", "ComputerScienist").build();
    	
    	assertEquals("Smith", p.getNom());
    	
    }
    
    @Test
    public void testPersonneTel() {
    	
    	String tel = new String("00000000");
    	List<String> tmp = new ArrayList<>();
    	tmp.add(tel);
    	tmp.add("12345678");
    	Personnel p = new Personnel.Builder("Smith", "John", "ComputerScienist").UpdatePhoneList(tmp).build();
    	
    	assertEquals("Smith", p.getNom());
    	assertEquals("00000000", p.getTel().get(0));
    	assertEquals("12345678", p.getTel().get(1));
    }
    
    
    @Test
    public void testPersonneDate() {
    	
    	LocalDate t = LocalDate.now();
    	List<String> tmp = new ArrayList<>();
    	Personnel p = new Personnel.Builder("Smith", "John", "ComputerScienist").UpdateDateNaissance(t).build();
    	
    	assertEquals(LocalDate.now(), p.getLocalDate());
    }
    
    
    @Test
    public void testIterator() {
    	
    	Annuaire a = Annuaire.getInstance(); 
    	String tel = new String("00000000");
    	List<String> tmp = new ArrayList<>();
    	tmp.add(tel);
    	tmp.add("12345678");
    	Personnel p = new Personnel.Builder("Smith", "John", "ComputerScienist").UpdatePhoneList(tmp).build();
    	
    	a.addEquipe(p);
    	a.addEquipe(new Groupe("Groupe1"));
    	a.addEquipe(new Groupe("Groupe2"));
    	a.addEquipe(new Groupe("Groupe3"));
    	a.addEquipe(new Groupe("Groupe4"));
    	System.out.println("Start");
    	
    	for(Equipe e : a) {
    		
    		e.printNom();
    	}
    	
    	/*while (ee.hasNext()) {
    				
    		Equipe e = ee.next(); 
    		e.printNom();
    	}*/
    	
    }
    
    @Test
    public void testNode() {
    	
    	String tel = new String("00000000");
    	List<String> tmp = new ArrayList<>();
    	tmp.add(tel);
    	tmp.add("12345678");
    	Personnel p = new Personnel.Builder("Smith", "John", "ComputerScienist").UpdatePhoneList(tmp).build();
    	Node<Equipe> one = new Node<Equipe>(p);
    	one.addElement(new Groupe("g1"));
    	one.addElement(p);
    	one.addElement(new Groupe("g2"));
    	one.addElement(new Groupe("g3"));
    	
    	Node<Equipe> iterator = one;
    	while(iterator.hasNext()) {
    		
    		iterator.getElement().printNom();
    		iterator = iterator.getNext();
    	}
    	
    	
    }
    
    
    @Test
    public void testIteratorSurGroupe() {
    	
    	Groupe g = new Groupe("Premier");
    	String tel = new String("00000000");
    	List<String> tmp = new ArrayList<>();
    	tmp.add(tel);
    	tmp.add("12345678");
    	Personnel p = new Personnel.Builder("Smith", "John", "ComputerScienist").UpdatePhoneList(tmp).build();
    	
    	g.ajoutMembre(p);
    	g.ajoutMembre(new Groupe("g2"));
    	
    	for(Equipe e : g) {
    		e.printNom();
    	}
    	
    }
    
    
    @Test
    public void testAnnuaireComplet() {
    	
    	Annuaire a = Annuaire.getInstance(); 
    	String tel = new String("00000000");
    	Groupe gg = new Groupe("PDG");
    	Groupe g2 = new Groupe("VICE_PRESIDENT");
    	List<String> tmp = new ArrayList<>();
    	tmp.add(tel);
    	tmp.add("12345678");
    	Personnel p1 = new Personnel.Builder("Smith", "John", "ComputerScienist").UpdatePhoneList(tmp).build();
    	Personnel p2 = new Personnel.Builder("pg", "lp", "class").UpdatePhoneList(tmp).build();
    	
    	gg.ajoutMembre(p1);
    	gg.ajoutMembre(p2);
    	g2.ajoutMembre(p1);
    	a.addEquipe(p1);
    	a.addEquipe(new Groupe("Groupe1"));
    	a.addEquipe(new Groupe("Groupe2"));
    	a.addEquipe(gg);
    	a.addEquipe(new Groupe("Groupe3"));
    	a.addEquipe(new Groupe("Groupe4"));
    	a.addEquipe(g2);
    	System.out.println("Start");
    	
    	for(Equipe e : a) {
    		
    		e.printNom();
    	}
    	
    	
    }
    
    
}
