package HeroDescendants;

/**
 * @author Jonathan Fachola	
 * @date January, 25 2015
 * 
 * Driver class made to test and run the functionality of the hero class
 */

public class HeroDriver {

	public static void main(String[] args) {
		
		//an object of hero was created called h1, with a name passed to constructor, "Stephen"
		Hero h1 = new Hero("Stephen");

		//a toString method was created so class has a custom notation of string return
		//displays the hero name and his ability power levels
		System.out.println(h1);
		
		//makes an object of SuperHero, an extention to Hero
		SuperHero h2 = new SuperHero("Improvo");
		h2.show();
		//Displays ability powers of h2
		h2.showPowers();
		
		//Testing the damage output of hero h1 and h2
		System.out.println("\nDAMAGE OUTPUT;");
		for (int i=0;i<10;i++)
		{
			//h1.fight();
			h2.fight();
		}

	}

}
