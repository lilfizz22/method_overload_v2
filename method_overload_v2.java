class Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
class Adder {
        public long add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a.concat(b);
    }

    public Color add(Color c1, Color c2) {
        String color1 = c1.getColor();
        String color2 = c2.getColor();
        String result;

        if ((color1.equals("red") && color2.equals("blue")) || (color1.equals("blue") && color2.equals("red"))) {
            result = "Megenta";
        } else if ((color1.equals("red") && color2.equals("green")) || (color1.equals("green") && color2.equals("red"))) {
            result = "Yellow";
        } else if ((color1.equals("blue") && color2.equals("green")) || (color1.equals("green") && color2.equals("blue"))) {
            result = "Cyan";
        } else {
            result = "Unknown";
        }
        return new Color(result);
    }
}

public class method_overload_v2 extends Adder {
}
