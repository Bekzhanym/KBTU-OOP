public final class Player implements Jumpable, Locatable {

    private static final double JUMP_DELTA_Y = 2.0;

    private final Position position = new Position();

    @Override
    public void move(double dx, double dy) {
        position.translate(dx, dy);
    }

    @Override
    public void jump() {
        position.translate(0, JUMP_DELTA_Y);
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
        return "Player(" + getX() + ", " + getY() + ")";
    }
}
