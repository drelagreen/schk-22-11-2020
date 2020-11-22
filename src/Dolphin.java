import java.util.Arrays;

public class Dolphin implements Animal{

    @Override
    public void sound() {
        System.out.println("*звуки дельфина*");
    }

    @Override
    public void eatFood() {
        System.out.println("*Съел рыбу*");
    }

    @Override
    public String getColor() {
        return "Серый";
    }

//    @Override
//    public String toString() {
//        sound();
//        eatFood();
//        eatFood("корм");
//        return getColor();
//    }

    private String name = "Гоша";
    private String[] arr = new String[10];

    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}