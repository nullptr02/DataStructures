package ChapterOne;

public class CounterDemo {
    public static void main(String[] args) {

        //declares a variable c of type Counter but does not initialize it
        Counter c;

        // creates a new counter and saves the reference to it in variable c
        c = new Counter();

        //increase the value of counter by one
        c.increment();

        //add three to the counter
        c.increment(3);

        // save the value of c.count in a variable called temp
        int temp = c.getCount();

        //reset the value of count
        c.reset();

        //Create a new counter and save its reference in var d and initialize d.count to val 5
        Counter d = new Counter(5);

        //increment value of count for reference d
        d.increment();

        // Copies the reference d to variable e
        Counter e = d;

        temp = e.getCount();
        e.increment(2);
    }
}
