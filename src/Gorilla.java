//worked with Rayven, Elvyn, LaNasha, Tyra, Thien

public class Gorilla extends Mammal {

    public Gorilla(int energy) {
        super(energy);
    }

    public Gorilla() {
        super();
    }

    @Override
    public int getEnergy() {
        return super.getEnergy();
    }

    @Override
    public void setEnergy(int energy) {
        super.setEnergy(energy);
    }

    public void throwSomething() {
        setEnergy(getEnergy() - 5);
        System.out.println("Gorilla threw something!");
    }

    public void eatBananas() {
        setEnergy(getEnergy() + 10);
        System.out.println("Gorilla very happy!");
    }

    public void climb() {
        setEnergy(getEnergy() - 10);
        System.out.println("Gorilla climbing!");
    }
}