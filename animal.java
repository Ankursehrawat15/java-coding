public class Main {

    public static void main(String[] args) {
        Animals[] animals = new Animals[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Lion();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        ShowPetSounds(animals);
    }

    public static void ShowPetSounds(IMakesSound[] petNoises) {
        for (int i = 0; i < petNoises.length; i++) {
            petNoises[i].callSound();
        }
    }

}
