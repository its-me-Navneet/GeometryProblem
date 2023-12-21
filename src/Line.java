public class Line {

    Point A, B;
    private double length;

    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
        this.length = this.Length();
    }

    public double Length() {

        double x1 = A.x;
        double y1 = A.y;
        double x2 = B.x;
        double y2 = B.y;
        double sumOfSquare = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double ans = Math.sqrt(sumOfSquare);
        return ans;

    }

    public static boolean isEqual(Line A, Line B) {
        return A.length == B.length;
    }

    public static double compare(Line A, Line B) {
        return A.length - B.length;
    }

    public double getLength() {
        return this.length;
    }

}
