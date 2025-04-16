public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Hay";
    }

    @Override
    public Cow clone() {
        return new Cow();
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    public String toString() {
        return "Cow";
    }
}
