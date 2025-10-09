/*
class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();
        plot1.setWidth(75);
        plot2.setWidth(75);
        plot3.setWidth(75);
        plot2.setLength(75);
        int area1 = plot1.calculateArea();
        int area2 = plot2.calculateArea();
        int area3 = plot3.calculateArea();
        System.out.println("These three plots require " + (area1+area2+area3) + " square feet of land.");

    }

}

class Rectangle {

   // instance variables
   private int length;
   private int width;

   // constructor to create a Rectangle object with a particular width and length
   public Rectangle(int length, int width) {
       this.length = length;
       this.width = width;
   }

   // constructor to create a Rectangle object with equal width and length (a square)
   public Rectangle(int side) {
       length = side;
       width = side;
   }

   // "no-argument" constructor which creates a Rectangle object with default values
   public Rectangle() {
       length = 100;
       width = 50;
   }

   // "getter" method that returns the length of the Rectangle
   public int getLength() {
       return length;
   }

   // "setter" methods that sets the length of the Rectangle to a new length
   public void setLength(int newLength) {
       length = newLength;
   }

   // "getter" method that returns the width of the Rectangle
   public int getWidth() {
       return width;
   }


   // "setter" methods that sets the width of the Rectangle to a new width
   public void setWidth(int newWidth) {
       width = newWidth;
   }

   // calculates and returns the area of the Rectangle
   public int calculateArea() {
       return width * length;
   }
}
*/

class PointTester {
        public static void main(String[] args) {
            System.out.println("-- TESTING CONSTRUCTORS AND GETTER METHODS --");
            Point p1 = new Point(10, 5);
            System.out.println(p1.getX());
            System.out.println(p1.getY());
   
            Point p2 = new Point(12);
            System.out.println(p2.getX());
            System.out.println(p2.getY());
   
            Point p3 = new Point();
            System.out.println(p3.getX());
            System.out.println(p3.getY());
   
            System.out.println("-- TESTING SETTER, COORDINATE, QUADRANT METHODS --");
            System.out.println(p1.coordinate());
            System.out.println(p1.quadrant());
            p1.setX(-8);
            System.out.println(p1.coordinate());
            System.out.println(p1.quadrant());
            p1.setY(-14);
            System.out.println(p1.coordinate());
            System.out.println(p1.quadrant());
            p1.setX(7);
            System.out.println(p1.coordinate());
            System.out.println(p1.quadrant());
            p1.setX(0);
            System.out.println(p1.coordinate());
            System.out.println(p1.quadrant());
            p1.setY(0);
            System.out.println(p1.coordinate());
            System.out.println(p1.quadrant());
            p1.setX(13);
            System.out.println(p1.coordinate());
            System.out.println(p1.quadrant());
        }
    }



class Point {
    private int x;
    private int y;

    public Point(int xCord, int yCord) {
        x = xCord;
        y = yCord;
    }

    public Point(int xCord) {
        x = xCord;
        y = xCord;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newCord) {
        x = newCord;
    }

    public void setY(int newCord) { 
        y = newCord;
    }
    
    public String coordinate() {
        return "("+x+", "+y+")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if ((x == 0 && y!=0) || (x!=0 && y==0)) {
            return "on an axis";
        }
        return "origin";
    }
}

