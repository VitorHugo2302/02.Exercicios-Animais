import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        Animal cachorro = new Cachorro("Rex", 3, "Labrador");
        Animal gato = new Gato("Mimi", 2, "Branco");

        animais.add(cachorro);
        animais.add(gato);

        for (Animal animal : animais) {

            animal.emitirSom();

            System.out.println(animal);
            System.out.println();
        }
    }
}
