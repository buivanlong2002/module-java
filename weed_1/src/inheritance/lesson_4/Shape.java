package inheritance.lesson_4;

public class Shape {
    private String color;

    public Shape() {
        this.color = "white";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape with color: " + color;
    }
}

