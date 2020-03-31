package geometries;

import static primitives.Util.isZero;


/**
 * @author benyamin neman & moshe barmetz
 * RadialGeometry is ana abstract class that defines
 * all radial geometries.
 */
public abstract class RadialGeometry implements Geometry {
    double _radius;

    //constructor
    public RadialGeometry(double _radius) {
        if (isZero(_radius) || _radius < 0.0)
            throw new IllegalArgumentException("radius "+ _radius +" is not valid");

        this._radius = _radius;
    }

    public RadialGeometry(RadialGeometry other)
    {
        this._radius = other._radius;
    }
    //getter
    public double get_radius() {
        return _radius;
    }
}
