package pkgGame;

import static org.junit.Assert.*;


import org.junit.Test;

import pkgEnum.eGameDifficulty;

public class EGameDifficultyTest {
	
	@Test
	
	public void gameDifficulty_Test() {
		
		eGameDifficulty check = eGameDifficulty.get(99);
		assertNull(check);
		
		check = eGameDifficulty.get(100);
		assertEquals(eGameDifficulty.EASY,check);
		
		check = eGameDifficulty.get(152);
		assertEquals(eGameDifficulty.EASY,check);
		
		check = eGameDifficulty.get(499);
		assertEquals(eGameDifficulty.EASY,check);
		
		check = eGameDifficulty.get(500);
		assertEquals(eGameDifficulty.MEDIUM,check);
		
		check = eGameDifficulty.get(70000);
		assertEquals(eGameDifficulty.HARD,check);
		
		
		
		
	}
	

}
