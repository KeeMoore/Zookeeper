public class Bat extends Mammal{
    public Bat(int energy){
        super(energy);
    }

    public Bat() {
        super(300);
    }

    @Override
    public int getEnergy() {
        return super.getEnergy();
    }

    @Override
    public void setEnergy(int energy) {
        super.setEnergy(energy);
    }

    public void fly() {
        setEnergy(getEnergy() - 50);
        System.out.println("Bat is airborne!");
    }

    public void eatHumans() {
        setEnergy(getEnergy() + 25);
        System.out.println("Bat is sucking the human's blood!");
    }

    public void attackTown() {
        setEnergy(getEnergy() - 100);
        System.out.println("Bat is destroying the town!");
    }
}
