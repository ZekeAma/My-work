package codingBot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingBotTest {




	 @Test
	    void testWordEnds_inputabcXY123XYijkXY_c13i() { 
		 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("c13i", codingBatProblem1.wordEnds("abcXY123XYijk", "XY"));
	    }
	 @Test
	    void testWordEnds_inputXY123XyXY_13() { 
		 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("13", codingBatProblem1.wordEnds("XY123XY", "XY"));
	    }
	 @Test
	    void testWordEnds_inputXY1XY_11() { 
		 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("11", codingBatProblem1.wordEnds("XY1XY", "XY"));
	    }
	 @Test
	    void testWordEnds_inputXYXY_XY() { 
		 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("XY", codingBatProblem1.wordEnds("XYXY", "XY"));
	    }
	 @Test
	    void testWordEnds_inputXYXY_NOTHING() { 
		 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("", codingBatProblem1.wordEnds("XY", "XY"));
	    }
	 @Test
	    void testWordEnds_inpuHI_NOTHING() { 
		 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("", codingBatProblem1.wordEnds("HI", "XY"));
	    }
	 @Test
	    void testWordEnds_inputXY1_NOTHING() { 
	 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("", codingBatProblem1.wordEnds("", "XY"));
	    }
	 @Test
	    void testWordEnds_inputabc1xyz11_cxz() { 
	 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("cxz", codingBatProblem1.wordEnds("abc1xyz1", "1"));
	    }
	 @Test
	    void testWordEnds_inputabc1xyz111_cxz11() { 
	 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("cxz11", codingBatProblem1.wordEnds("abc1xyz11", "1"));
	    }
	 @Test
	    void testWordEnds_inputabc1xyz1abcabc_11() { 
	 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("11", codingBatProblem1.wordEnds("abc1xyz1abc", "abc"));
	    }
	 @Test
	    void testWordEnds_inputabc1xyz1abcb_acac() { 
	 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("acac", codingBatProblem1.wordEnds("abc1xyz1abc", "b"));
	    }
	 @Test
	    void testWordEnds_inputabc1abc1abc_abc() { 
	 CodingBot codingBatProblem1 = new CodingBot();
	        assertEquals("1111", codingBatProblem1.wordEnds("abc1abc1abc", "abc"));
	    }
	 
	 
	
	 
}
