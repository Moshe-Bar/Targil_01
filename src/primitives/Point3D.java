package primitives;

import java.util.Objects;

/**
 * Class Point3D is the basic class representing a point in a
 * 3D system.
 *
 * @author Benyamin neman & moshe barmetz
 */
public class Point3D {
    public Point3D _coord;
    Coordinate _x;
    Coordinate _y;
    Coordinate _z;

    /**
     * @param _x coordinate on the X axis
     * @param _y coordinate on the Y axis
     * @param _z coordinate on the Z axis
     */
    public final static Point3D ZERO = new Point3D(0.0, 0.0, 0.0);

    // constructors
    public Point3D(Coordinate x, Coordinate y, Coordinate z) {
        this._x = x;
        this._y = y;
        this._z = z;
    }

    public Point3D(double x, double y, double z) {
        this(new Coordinate(x), new Coordinate(y), new Coordinate(z));
    }

    public Point3D(Point3D point) {
        this._x = point._x;
        this._y = point._y;
        this._z = point._z;
    }

    //getters
    public Coordinate get_x() {
        return new Coordinate(_x);
    }

    public Coordinate get_y() {
        return new Coordinate(_y);
    }

    public Coordinate get_z() {
        return new Coordinate(_z);
    }

    //Subtraction between two points, returns a vector
    // By subtract the all coordinates of the other point from 'this' instant's coordinates
    //Return a new Vector of the result
    public Vector subtract(Point3D p) {
        return new Vector(new Point3D(
                this._x._coord - p._x._coord,
                this._y._coord - p._y._coord,
                this._z._coord - p._z._coord));

    }

    // Add a Vector to this Point, returns a Point
    // By adding the Vectors coordinates(the direction of the vector) to this coordinates
    // Returns a new Point with the new coordinates
    public Point3D add(Vector vector)
    {
        return new Point3D(this._x._coord + vector._head._x._coord ,
                            this._y._coord + vector._head._y._coord ,
                            this._z ._coord+ vector._head._z._coord) ;
    }

    //distanceSquared
    //mekabel nekoda nosefet ve makhzira et merkhak ben hanekoda she kibalti me nekoda hanokhekhi bariboa
    public double distanceSquared(Point3D point)
    {
        return ( (point._x._coord - this._x._coord) * (point._x._coord - this._x._coord) +
                (point._y._coord - this._y._coord) * (point._y._coord - this._y._coord) +
                (point._z._coord - this._z._coord) * (point._z._coord - this._z._coord));
    }
    //makhzir merkhak ben shne nekodot
    public double distance (Point3D point)
    {
        return Math.sqrt(distanceSquared(point));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return  _x.equals(point3D._x) &&
                _y.equals(point3D._y) &&
                _z.equals(point3D._z);
    }


    @Override
    public String toString() {
        return " (" + _x +" ,"+ _y +" ,"+ _z +")";
    }
}
