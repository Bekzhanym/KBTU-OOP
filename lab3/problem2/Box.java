public final class Box implements Moveable, Locatable {

    private final Position position = new Position();

    @Override
    public void move(double dx, double dy) {
        position.translate(dx, dy);
    }

    @Override
    public double getX() {
        return position.getX();
    }

    @Override
    public double getY() {
        return position.getY();
    }

    @Override
    public String toString() {
        return "Box(" + getX() + ", " + getY() + ")";
    }
}
