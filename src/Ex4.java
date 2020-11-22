import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Dog());
        list.add(new Dog());
        list.add(new Cat());
        list.add(new Cat());
        list.add(new Cow());
        list.add(new Dolphin());

        for (Animal animal : list) {
            System.out.println(animal);
            System.out.println();
        }
    }
}
