package exercises.technology.main;

public class SmartPhone extends Computer {
    private int numberOfSelfies;

    public SmartPhone(int storage, int ram, boolean hasKeyboard, int numberOfSelfies) {
        super(storage, ram, hasKeyboard);
        this.numberOfSelfies = numberOfSelfies;
    }

    public int takeSelfie() {
        return (this.numberOfSelfies = this.numberOfSelfies + 1);
    }

    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }
}
