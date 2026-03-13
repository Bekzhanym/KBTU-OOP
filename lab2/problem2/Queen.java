public class Queen extends Piece {

    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b == null || !b.isOnBoard()) return false;
        int dr = Math.abs(b.getRow() - a.getRow());
        int dc = Math.abs(b.getCol() - a.getCol());
        if (dr == 0 && dc == 0) return false;
        return dr == 0 || dc == 0 || dr == dc;
    }
}
