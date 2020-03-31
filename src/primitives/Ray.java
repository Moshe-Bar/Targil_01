package primitives;

import java.util.Objects;

public class Ray {
    Point3D _p;
    Vector _dir;

    //constructor
    public Ray(Point3D _p0, Vector _dir) {
        this._p = _p0;
        this._dir = _dir;
    }
    public Ray(Ray ray)
    {
        this._p=new Point3D(ray._p);
        this._dir=new Vector(ray._dir);
    }

    //getter
    public Point3D get_p() {
        return _p._coord;
    }

    public Vector get_dir() {
        return new Vector(_dir._head._x._coord ,_dir._head._y._coord ,_dir._head._z._coord);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return this._dir.equals(ray._dir) &&
                this._p.equals(ray._p);
    }


    @Override
    public String toString() {
        return "Ray : " +
                "start Point= " + _p +
                ", Direction =" + _dir ;
    }
}
