package uvsq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    
}
