public class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("Мяу");
    }

    @Override
    public void eatFood() {
        System.out.println("*Съел рыбу*");
    }

    @Override
    public String getColor() {
        return "Черный";
    }

    @Override
    public String toString() {
        sound();
        eatFood();
        eatFood("корм");
        return getColor();
    }
}