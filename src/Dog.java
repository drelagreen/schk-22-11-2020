public class Dog  implements Animal{

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void eatFood() {
        System.out.println("*Ate meat*");
    }

    @Override
    public void eatFood(String food) {
        System.out.println("*Ate "+food+"*");
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String toString() {
        sound();
        eatFood();
        eatFood("Forage");
        return getColor();
    }
}