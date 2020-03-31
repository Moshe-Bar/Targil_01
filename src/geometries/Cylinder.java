package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Cylinder extends Tube {
    double height;

/** Cylinder constructor
 * @param _radius
 * @param _axisRay
 * @param height
 */
    public Cylinder(double _radius, Ray _axisRay, double height) {
        super(_radius, _axisRay);
        this.height = height;
    }
    //getter
    public double getHeight() {
        return height;
    }

    @Override
    public Vector getNormal(Point3D point) {
        return null;
    }

    @Override
    public String toString() {
        return "height = " + height +
                " , _axisRay = " + _axisRay +
                " , _radius = " + _radius;
    }
}
