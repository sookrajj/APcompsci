package Q4.VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Dog
        if (getHunger() - 10 < MIN_HUNGER) {
            setHunger(MIN_HUNGER);
        }else {
            setHunger(getHunger()-10);
        }
        if (getHappiness() + 15 > MAX_HAPPINESS) {
            setHappiness(MAX_HAPPINESS);
        }else {
            setHappiness(getHappiness()+15);
        }
        if (getEnergy() + 10 > MAX_ENERGY) {
            setEnergy(MAX_ENERGY);
        }else {
            setEnergy(getEnergy()+10);
        }
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Dog
        if (getHunger() + 20 > MAX_HUNGER) {
            setHunger(MAX_HUNGER);
        }else {
            setHunger(getHunger()+20);
        }
        if (getHappiness() + 15 > MAX_HAPPINESS) {
            setHappiness(MAX_HAPPINESS);
        }else {
            setHappiness(getHappiness()+15);
        }
        if (getEnergy() - 10 < MIN_ENERGY) {
            setEnergy(MIN_ENERGY);
        }else {
            setEnergy(getEnergy()-10);
        }
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
        if (getHunger() + 10 > MAX_HUNGER) {
            setHunger(MAX_HUNGER);
        }else {
            setHunger(getHunger()+10);
        }
        if (getHappiness() + 5 > MAX_HAPPINESS) {
            setHappiness(MAX_HAPPINESS);
        }else {
            setHappiness(getHappiness()+5);
        }
        if (getEnergy() + 20 > MAX_ENERGY) {
            setEnergy(MAX_ENERGY);
        }else {
            setEnergy(getEnergy()+10);
        }
    }
}
