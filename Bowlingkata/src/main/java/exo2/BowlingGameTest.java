package exo2;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	 Game g = new Game();
	 
	 
	 public void testGutterGame() throws Exception {
		 rollMany(20, 0);
		    assertEquals(0, g.score());
		  }
	 
	 

		  private void rollMany(int n, int pins) {
		    for (int i = 0; i < n; i++)
		      g.roll(pins);
		  }

		  
		  
		  
		  
		  public void testAllOnes() throws Exception {
		    rollMany(20,1);
		    assertEquals(20, g.score());
		  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}