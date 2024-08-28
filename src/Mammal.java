//worked with Rayven, Elvyn, LaNasha, Tyra, Thien

public class Mammal {
    private int energy = 100;

    public Mammal(int energy) {
        this.energy = energy;
    }

    public Mammal() {

    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void displayEnergy() {
        System.out.println("Energy Level: " + energy);
    }

}