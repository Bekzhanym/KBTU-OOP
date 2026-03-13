
public class Pawn extends Piece {

    private boolean isWhite;

    public Pawn(Position a, boolean isWhite) {
        super(a);
        this.isWhite = isWhite;
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b == null || !b.isOnBoard()) return false;
        int dr = b.getRow() - a.getRow();
        int dc = b.getCol() - a.getCol();
        int step = isWhite ? 1 : -1;

        if (dc == 0) {
            return dr == step || (dr == 2 * step && a.getRow() == (isWhite ? 1 : 6));
        }
        if (Math.abs(dc) == 1 && dr == step) {
            return true;
        }
        return false;
    }

    public boolean isWhite() {
        return isWhite;
    }
}
