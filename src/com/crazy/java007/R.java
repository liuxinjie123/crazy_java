package com.crazy.java007;

public class R {
    int count;
    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R{" +
                "count=" + count +
                '}';
    }
    public boolean equals(Object object) {
        if (object instanceof R) {
            R r = (R) object;
            return r.count == this.count;
        }
        return false;
    }

    public int hashCode() {
        return this.count;
    }

}
