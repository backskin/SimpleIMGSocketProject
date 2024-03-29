package backsoft.utils;

import java.io.Serializable;

public class Pair<A, B> implements Serializable {

    private final A one;
    private final B two;

    public Pair(A one, B two) {
        this.one = one;
        this.two = two;
    }

    public A getOne() {
        return one;
    }
    public B getTwo() {
        return two;
    }
}
