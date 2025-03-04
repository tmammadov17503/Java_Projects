package Week03.GeometryEx;

public class Point {
    private float x, y;

    public Point() {
        this(0, 0);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.getX(), p.getY());
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        return (float)Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public boolean equals(Point p) {
        return this.x == p.getX() && this.y == p.getY();
    }

    public String toString() {
        return String.format("( %f, %f )", x, y);
    }
}
