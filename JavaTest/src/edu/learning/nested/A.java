package edu.learning.nested;

public class A {

    private int count;
    public void setCount(int count) {
        this.count = count;
    }

    static class B {
        private int total;
        public void setTotal(int total) {
            this.total = total;
            A a = new A();
            a.setCount(a.count);
        }
    }

}