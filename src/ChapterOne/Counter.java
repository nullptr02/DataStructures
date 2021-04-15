package ChapterOne;

public class Counter {

    // instance variable that represents count
    private int count;

    // default public constructor
    public Counter() {
    }

    // One argument constructor
    public Counter(int count) {
        this.count = count;
    }

    // returns the value of class variable count
    public int getCount() {
        return count;
    }

    // increments class variable count by one everytime this method is called
    public void increment() {
        count++;
    }

    // increments class variable by a specific amount delta
    public void increment(int delta) {
        count += delta;
    }

    // resets class variable count
    public void reset() {
        count = 0;
    }
}
