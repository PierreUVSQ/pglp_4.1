package uvsq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    
    
}
