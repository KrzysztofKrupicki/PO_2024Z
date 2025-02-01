package space;

public final class InmutableSpacecraftPosition {
    private double x;
    private double y;
    private double z;

    public InmutableSpacecraftPosition(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "[" + getX() + ", " + getY() + ", " + getZ() + "]";
    }

    public InmutableSpacecraftPosition move(double xChange, double yChange, double zChange) {
        return new InmutableSpacecraftPosition(getX() + xChange, getY() + yChange, getZ() + zChange);
    }
}
