package Q4.VirtualPetLab;
import java.util.ArrayList;

public class PetManager {
    private ArrayList<Pet> pets = new ArrayList<>();

    // TODO: Implement methods as needed to interact with the pets list
    public void addPet(Pet pet) {
        pets.add(pet);
    }
    public void removePet(String name) {
        for (int lcv = 0; lcv < pets; lcv++) {
            if (pets.get(lcv).getName().equals(name)) {
                pets.remove(lcv);
            }
        }
    }

    public ArrayList<Pet> getPets() { return pets;}

}
