public class Program {
    public static void main(String[] args) {
        method_overload_v2 adder = new method_overload_v2();

        Color c1 = new Color("red");
        Color c2 = new Color("blue");
        Color c3 = adder.add(c1, c2);
        System.out.println("Red + Blue = " + c3.getColor());

        Color c4 = new Color("red");
        Color c5 = new Color("green");
        Color c6 = adder.add(c4, c5);
        System.out.println("Red + Green = " + c6.getColor());

        Color c7 = new Color("blue");
        Color c8 = new Color("green");
        Color c9 = adder.add(c7, c8);
        System.out.println("Blue + Green = " + c9.getColor());
    }
}