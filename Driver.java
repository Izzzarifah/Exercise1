//Author : Izz Zarifah Zulkefli
public class Driver {

	public static void main(String [] arg) {

		//Fish actually is a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish();     //nemo is object, fish is class

		nemo.Swim();
		//nemo.color = "red";  //tukar value
		nemo.SetColor("red");    //change here
		nemo.Swim();
		nemo.Eat();    //superclass call subclass



		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		//Fish dory = new Fish();   //another object
		//dory.Swim();    //output akan sama ngn default (yg pertama) sbb diaefau
        //dory.color = "yellow";
        //dory.SetColor("yellow");    //change here
        //dory.Swim();

        //Aquirium fancyAquirium = new Aquirium();
        //fancyAquirium.fillFish();

	}


}