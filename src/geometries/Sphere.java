package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Sphere extends RadialGeometry {
    Point3D _center;

    /**
     * constructor for a new sphere object.
     *
     * @param _radius the radius of the sphere
     * @param _center the center point of the sphere
     *
     * @throws Exception in case of negative or zero radius from RadialGeometry constructor
     */
    public Sphere(double _radius, Point3D _center) {
        super(_radius);
        this._center = new Point3D(_center);
    }

    public Sphere(RadialGeometry other, Point3D _center) {
        super(other);
        this._center =new Point3D(_center);
    }

    //getter
    public Point3D get_center() {
        return _center;
    }

    @Override
    public String toString() {
        return "point : " + _center + ", radius : " + _radius;
    }

    @Override
    public Vector getNormal(Point3D point) {
        return null;
    }

}
