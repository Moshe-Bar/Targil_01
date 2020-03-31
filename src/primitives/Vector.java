package primitives;

public class Vector {
    Point3D _head;

//constructor
    /**
     * constructore she mekabel nekoda ve sam oto ke _head shel vector
     * ve bodek im havector ho efes zorek shegiaa
     * @param p
     */
    public Vector(Point3D p) {
        if (p.equals(Point3D.ZERO)) {
            throw new IllegalArgumentException("ZERO point not valid for vector");
        }
        this._head = new Point3D(p._x._coord, p._y._coord, p._z._coord);
    }
    /**
     * constructor she mekabel vector ve yotser vector
     * @param v
     */
    public Vector(Vector v) {
        this(v._head);
    }
    /**
     * constructor she mekabel 3 misparim ve yotser vector
     * @param x
     * @param y
     * @param z
     */
    public Vector(double x,double y, double z) {
        this(new Point3D(x,y,z));
    }
    /**
     * constructor she mekabel 3 coordinatot ve yotser vector
     * @param x
     * @param y
     * @param z
     */
    public Vector (Coordinate x , Coordinate y , Coordinate z)
    {
      this(new Point3D(x,y,z));
    }

    public Vector(Point3D p1, Point3D p2)
    {
        this(p1.subtract(p2));
    }

    //getter
    public Point3D get_head() {
        return new Point3D(_head._x._coord ,_head._y._coord ,_head._z._coord);
}

    /**
     * @param vector
     * sdd function
     */
    public Point3D add(Vector vector) {
        return  this._head.add(vector);
    }

    /**
     * @param vector
     * subtract function
     */
    public Vector subtract(Vector vector) {
        return this._head.subtract(vector._head);
    }

    /**
     * @param scaleFacor
     * scale function
     */
    public Vector scale(double scaleFacor) {
        return new Vector(
                new Point3D(
                        new Coordinate(scaleFacor * this._head._x._coord),
                        new Coordinate(scaleFacor * this._head._y._coord),
                        new Coordinate(scaleFacor * this._head._z._coord)));
    }
    /**
     * @param v
     * dot_product function
     */
    public double dotProduct(Vector v) {
        return (this._head._x._coord * v._head._x._coord +
                this._head._y._coord * v._head._y._coord +
                this._head._z._coord * v._head._z._coord);
    }
    /**
     * crossProduct function
     * @param v
     * @return makhzir vector khadash sheho nitsav al shebe vectorim she yesh li
     */
    public Vector crossProduct(Vector v) {
        double w1 = this._head._y._coord * v._head._z._coord - this._head._z._coord * v._head._y._coord;
        double w2 = this._head._z._coord * v._head._x._coord - this._head._x._coord * v._head._z._coord;
        double w3 = this._head._x._coord * v._head._y._coord - this._head._y._coord * v._head._x._coord;

        return new Vector(new Point3D(w1, w2, w3));
    }
    /**
     * lengthSquared function
     * mekhashev ve makhzir et orekh ha vektor bariboa
     */
    public double lengthSquared() {
        double x = this._head._x._coord * this._head._x._coord;
        double y = this._head._y._coord * this._head._y._coord;
        double z = this._head._z._coord * this._head._z._coord;

        return x + y + z;
    }
    /**
     * length function
     * makhzir et ha orekh shel ha vector
     */
    public double length() {
        return Math.sqrt(lengthSquared());
    }

    /**
     * normalize function
     * @return the same Vector after normalisation
     * @throws ArithmeticException if length = 0
     */
    public Vector normalize() {

        double x = this._head._x._coord;
        double y = this._head._y._coord;
        double z = this._head._z._coord;

        double length = this.length();

        if (length == 0)
            throw new ArithmeticException("divide by Zero");

        this._head._x = new Coordinate(x / length);
        this._head._y = new Coordinate(y / length);
        this._head._z = new Coordinate(z / length);

        return this;
    }

    /**
     *normalized function
     */
    public Vector normalized()
    {
        Vector vector = new Vector(this);
        vector.normalize();
        return vector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return _head.equals(vector._head);
    }


    @Override
    public String toString() {
        return "(" + _head._x + " ," + _head._y + " ," + _head._z + ")";
    }
}
