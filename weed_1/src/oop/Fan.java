package oop;


    public class Fan {
        // Hằng số
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        // Thuộc tính
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        // Constructor không tham số
        public Fan() {}

        // Getter và Setter
        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Phương thức toString
        @Override
        public String toString() {
            if (on) {
                return "Fan is on: speed = " + speed + ", color = " + color + ", radius = " + radius;
            } else {
                return "Fan is off: color = " + color + ", radius = " + radius;
            }
        }

        public static void main(String[] args) {
            Fan fan1 = new Fan();
            fan1.setSpeed(Fan.FAST);
            fan1.setRadius(10);
            fan1.setColor("yellow");
            fan1.setOn(true);

            // Tạo đối tượng Fan 2
            Fan fan2 = new Fan();
            fan2.setSpeed(Fan.MEDIUM);
            fan2.setRadius(5);
            fan2.setColor("blue");
            fan2.setOn(false);

            // Hiển thị thông tin
            System.out.println(fan1.toString());
            System.out.println(fan2.toString());
        }
    }


