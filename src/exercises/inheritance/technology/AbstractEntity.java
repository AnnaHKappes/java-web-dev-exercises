package exercises.inheritance.technology;

public abstract class AbstractEntity {
    int id;
    int nextID = 0;

    public AbstractEntity() {
        this.id = nextID;
        nextID++;
    }
}
