
public abstract class Piece {

    protected Position a;

    public Piece(Position a) {
        this.a = a;
    }

    public Position getPosition() {
        return a;
    }

    public void setPosition(Position a) {
        this.a = a;
    }


    public abstract boolean isLegalMove(Position b);
}
