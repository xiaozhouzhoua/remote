package base;

public class JdiDemo {
    public static int value;

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            new A().run();
        }
    }

    static class A {
        public void run() {
            new B().run();
        }
    }

    static class B {
        public void run() {
            new C().run();
        }
    }

    static class C {
        public void run() {
            JdiDemo.value++;
        }
    }
}
