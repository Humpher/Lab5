package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	
	EASY(100), MEDIUM(500) , HARD(1000);
	
  private eGameDifficulty(int iDifficulty) {
		
		this.iDifficulty = iDifficulty;
	}
	
	private int iDifficulty;
	
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();
	
	public int getiDifficulty() {
		
		return iDifficulty; 
	}
	
	public static eGameDifficulty get(int iDifficulty) {
		
		eGameDifficulty valSelected = null;
		
		for(eGameDifficulty val : values()) {
			
			if(val.iDifficulty <= iDifficulty ) {
				
				valSelected = val;
			}
		}
		
		return valSelected;
		
	}
	
	

}

