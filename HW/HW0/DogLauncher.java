public class DogLauncher {
    public static void main(String[] args) {
    	/** this is the case1 */
    	// Dog[] dogs = new Dog[3];
    	// dogs[0] = new Dog (5);
    	// dogs[1] = new Dog(20);
    	// dogs[2] = new Dog(50);
    	// for (int i = 0; i < 3; i++){
     //    	dogs[i].makeNoise();
    	// }

    	/** this is the case2 */
  		//Dog d = new Dog(15);
		// Dog d2 = new Dog(35);
		// // d.maxDog(d2);
		// d.maxDog(d2).makeNoise();

		/** this is the case3 */
		Dog smallDog = new Dog(5);
		Dog mediumDog = new Dog(25);
		Dog hugeDog = new Dog(150);

		Dog[] manyDogs = new Dog[4];
		manyDogs[0] = smallDog;
		manyDogs[1] = hugeDog;
		manyDogs[2] = new Dog(130);

		int i = 0;
		while (i < manyDogs.length){
			Dog.MaxDog(manyDogs[i], mediumDog).makeNoise();
			i = i + 1;
		}
	}
}