package src.accessmodifier;

class Counter2 {
    static int count;
    static {
        count = 10;
    }

    /*se lay bo nho chi mot lan và giu lai gia tri cua no */
    /*ket qua thuc hien in ra 3 dong cac gia tri : 1,2,3 */
    Counter2() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Counter2 c1 = new Counter2(); //count = 0
        Counter2 c2 = new Counter2(); //count = 1
        Counter2 c3 = new Counter2();
    }
    public void test() {
        count = 10;
        System.out.println(count);
    }
}