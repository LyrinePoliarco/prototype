public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(String name) {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new Sheep(this.name);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Sheep: " + name;
    }
}
