public interface Animal {
    void sound();

    void eatFood();

    default void eatFood(String food) {
        System.out.println("*Съел " + food + "*");
    }

    default void giveFood(String food){
        eatFood(food);
    }

    String getColor();
}
