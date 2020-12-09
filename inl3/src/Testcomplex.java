public class Testcomplex {
    public static void main(String[] args) {
        Complex a = new Complex(0.4, -0.8);
        Complex b = new Complex(1, 2);
        b.add(a);
        System.out.println(b.getRe());
        System.out.println(b.getIm());
        b.mul(a);
        System.out.println(b.getRe());
        System.out.println(b.getIm());

    }
}
