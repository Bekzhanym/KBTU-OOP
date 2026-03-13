public class Bishop extends Piece {

    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b == null || !b.isOnBoard()) return false;
        int dr = Math.abs(b.getRow() - a.getRow());
        int dc = Math.abs(b.getCol() - a.getCol());
        return dr == dc && dr != 0;
    }
}
