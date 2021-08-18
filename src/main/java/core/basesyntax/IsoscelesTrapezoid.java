package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle,"
                + " area: " + getArea() + " sq.units"
                + ", sideA: " + this.sideA
                + ", sideB: " + this.sideB
                + ", height: " + this.height
                + ", color: " + this.color);
    }

    @Override
    public double getArea() {
        return height * ((double)(sideA + sideB) / 2);
    }
}