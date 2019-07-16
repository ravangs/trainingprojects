
public class ChemicalElement {
	
	static boolean[] booleanAlkaliMetal = new boolean[118];
	static {
		booleanAlkaliMetal[2] = true;
		booleanAlkaliMetal[10] = true;
		booleanAlkaliMetal[18] = true;
		booleanAlkaliMetal[36] = true;
		booleanAlkaliMetal[54] = true;
		booleanAlkaliMetal[86] = true;
	}
	
	
	public int atomicNumber;
	public String atomicName;
	public String fullName;
	
	private static int[] alkaliMetal = { 3 , 11 , 19 , 37 , 55 , 87};
	
	private static int[] metal = { 13 , 49 , 50 , 81 , 82 , 83 , 113 , 114 , 115 , 116};
	
	ChemicalElement(int atomicNumber, String atomicName , String fullName){
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.fullName = fullName;
	}
	
	public boolean equals(Object o) {
		ChemicalElement other = (ChemicalElement) o;
		if(this.atomicNumber == other.atomicNumber &&
		this.atomicName == other.atomicName &&
		this.fullName == other.fullName) {
			return true;
		}
		return false;
	}
		
		
	public boolean isAlkaliMetal() {	
		
		return booleanAlkaliMetal[this.atomicNumber-1];
	}
	
	public boolean isMetal() {
		
		switch(this.atomicNumber) {
			case 13: return true;
			case 49: return true;
			case 50: return true;
			case 81: return true;
			case 82: return true;
			case 83: return true;
			case 113: return true;
			case 114: return true;
			case 115: return true;
			case 116: return true;
			default: return false;
		}
	}
		
	
	public boolean isTransistionMetal() {
		
		
		  if((this.atomicNumber >= 21 && this.atomicNumber <= 31) || (this.atomicNumber
		  >= 39 && this.atomicNumber <= 48) || (this.atomicNumber >= 72 &&
		  this.atomicNumber <= 80) || (this.atomicNumber >= 104 && this.atomicNumber <=
		  112)) { return true; }
		 
		
		
		return false;
	}
	
}
