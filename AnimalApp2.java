public class AnimalApp2 {
    public static void main(String[] args) {
        Animal2[] animais = new Animal2[3];
        animais[0] = new Cachorro2();
        animais[1] = new Gato2();
        animais[2] = new Vaca();

        for (Animal2 animal : animais) {
            animal.fazSom();
        }
    }
}
