package Day3.Lecture;

final public class ImmutableIntHolder {

    //Instance fields
    private final int value;

    //Constructor
    public ImmutableIntHolder(int value) {
        this.value = value;
    }

    //getter
    public int getValue() {
        return value;
    }
}
