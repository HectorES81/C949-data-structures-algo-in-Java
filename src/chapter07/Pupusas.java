package chapter07;
/* main classes */
/* inner classes and nested classes */

class Pupusas {
	String ingredient1;
	String ingredient2;
	String ingredient3;
	
	public Pupusas() {
		ingredient1 = "queso";
		ingredient2 = "chicharron";
		ingredient3 = "frijoles";
	}
	
	public String makePupusas(String[] ingredients) {
		return "Making " + String.join(",", ingredients) + " pupusas.";
	}
}

}
