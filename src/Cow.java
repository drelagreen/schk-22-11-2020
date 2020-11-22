public class Cow implements Animal{

    @Override
    public void sound() {
        System.out.println("Муу");
    }

    @Override
    public void eatFood() {
        System.out.println("*Поела сена. Наелась*");
    }

    @Override
    public String getColor() {
        return "Коричневая";
    }

    @Override
    public String toString() {
        sound();
        eatFood();
        eatFood("корм");
        return getColor();
    }
}