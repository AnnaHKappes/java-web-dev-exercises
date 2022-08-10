package exercises.technology.main;

public class Computer extends AbstractEntity{
    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int storage, int ram, boolean hasKeyboard) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public int increaseRAM (int n) {
        return this.ram = this.ram + n;
    }

    public int increaseStorage (int x) {
        return this.storage = this.storage + x;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }
}
