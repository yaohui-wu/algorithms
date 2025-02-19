public class PointSET {
    // construct an empty set of points
    public PointSET() {}

    // is the set empty?
    public boolean isEmpty() {}

    // number of points in the set
    public int size() {}

    // add the point to the set (if it is not already in the set)
    public void insert(Point2D p) {}

    // does the set contain point p?
    public boolean contains(Point2D p) {}

    // draw all points to standard draw
    public void draw() {}

    // all points that are inside the rectangle (or on the boundary)
    public Iterable<Point2D> range(RectHV rect) {}

    // a nearest neighbor in the set to point p; null if the set is empty
    public Point2D nearest(Point2D p) {}

    private void validateArg(Object obj) {
        if (obj == null) {
            String error = "Argument cannot be null";
            throw new IllegalArgumentException(error);
        }
    }

    // unit testing of the methods (optional)
    public static void main(String[] args) {}
}
