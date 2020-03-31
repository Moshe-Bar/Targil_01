package geometries;

import primitives.Point3D;
import primitives.Vector;

import java.awt.*;

public class Plane implements Geometry
{
    Point3D _p0;
    Vector _normal;

    public Plane(Point3D p1, Point3D p2, Point3D p3)
    {
        this._p0 = new Point3D(p1);
        Vector U = new Vector(p1, p2);
        Vector V = new Vector(p1, p3);
        Vector N = U.crossProduct(V);
        N.normalize();

       this._normal = N;
    }
    public Plane(Point3D p, Vector v)
    {
        this._p0 = new Point3D(p);
        this._normal = new Vector(v);
    }

    @Override
    public Vector getNormal(Point3D point) {
        return null;
   }

   // becuase polygon class
    public Vector getNormal() {
        return getNormal(null);
    }

    @Override
    public String toString() {
        return "_p0 = " + _p0 +
                " , _normal = " + _normal ;
    }
}



