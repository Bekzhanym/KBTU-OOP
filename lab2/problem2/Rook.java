public class Rook extends Piece {

    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b == null || !b.isOnBoard()) return false;
        int dr = b.getRow() - a.getRow();
        int dc = b.getCol() - a.getCol();
        if (dr == 0 && dc == 0) return false;
        return dr == 0 || dc == 0;
    }
}
