package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        double pp = (a + b + c) / 2.0;
        if (pp <= -1) {
            return -1;
        } else {
            return pp;
        }
    }

    public boolean exist(double ab, double ac, double bc) {
        if ((ab + bc) <= ac || (bc + ac) <= ab || (ac + ab) <= bc) {
            return false;
        }
        return true;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }
}
