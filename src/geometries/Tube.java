package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

/**
 * @author benyamin neman & moshe barmetz
 * Represents an infinite tube in the 3D space.
 * That is, the cylinder does not have a length.
 */
public class Tube extends RadialGeometry  {
    Ray _axisRay;

    // constructor
    public Tube(double _radius, Ray _axisRay) {
        super(_radius);
        this._axisRay = _axisRay;
    }

    // getter
    public Ray get_axisRay() {
        return _axisRay;
    }

    @Override
    public Vector getNormal(Point3D point) {
        return null;
    }

    @Override
    public String toString() {
        return "ray : " + _axisRay +
                " , radius : " + _radius;
    }
}
