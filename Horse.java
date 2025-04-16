public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Oats";
    }

    @Override
    public Horse clone() {
        return new Horse();
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    public String toString() {
        return "Horse";
    }
}
