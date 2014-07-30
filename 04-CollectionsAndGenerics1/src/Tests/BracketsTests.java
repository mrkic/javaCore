package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CollectionsAndGenerics.Brackets;

public class BracketsTests {
    private Brackets brackets;
    
    @Before
    public void setUp() throws Exception{
        brackets = new Brackets();
    }
    
    @After
    public void tearDown() throws Exception{
        
    }
    @Test
    public void test() {
        assertEquals(true, brackets.checkBrackets("()()()(())"));
        assertEquals(false, brackets.checkBrackets("())()()"));
    }

}
