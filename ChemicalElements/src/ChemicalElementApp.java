
public class ChemicalElementApp {

	public static void main(String[] args) {
		
		ChemicalElement hydrogen = new ChemicalElement(1,"H","Hydrogen");
		ChemicalElement oxygen = new ChemicalElement(8,"O","Oxygen");
		ChemicalElement potassium = new ChemicalElement(19,"K","Potassium");
		ChemicalElement zinc = new ChemicalElement(30,"Zn","Zinc");
		ChemicalElement gallium = new ChemicalElement(31,"Ga","Gallium");
		
		System.out.println(hydrogen.equals(hydrogen));
	}

}
