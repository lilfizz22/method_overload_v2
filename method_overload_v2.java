// Color类
class Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

// Adder类
class Adder {
    // 整数加法
    public long add(int a, int b) {
        return a + b;
    }

    // 字符串拼接
    public String add(String a, String b) {
        return a.concat(b);
    }

    // 颜色混合
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

// method_overload_v2类，继承Adder
public class method_overload_v2 extends Adder {
    // 这里可以添加你自己的扩展方法或属性
}