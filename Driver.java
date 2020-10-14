public class Driver {

	public static void main(String [] arg) {

		//Fish actually is a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish();     //nemo is object, fish is class

		nemo.Swim();
		nemo.color = "red";  //tukar value
		nemo.Swim();

		Fish dory = new Fish();   //another object
		dory.Swim();    //output akan sama ngn default (yg pertama) sbb diaefau
        dory.color = "yellow";
        dory.Swim();

	}


}