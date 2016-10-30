package exo2;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	 Game g = new Game();
	 public void testGutterGame() throws Exception {
		    for (int i = 0; i < 20; i++)
		      g.roll(0);
		    assertEquals(0, g.score());
		  }

		  public void testAllOnes() throws Exception {
		    for (int i = 0; i < 20; i++)
		      g.roll(1);
		    assertEquals(20, g.score());
		  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}