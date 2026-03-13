public class King extends Piece {

    public King(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b == null || !b.isOnBoard()) return false;
        int dr = Math.abs(b.getRow() - a.getRow());
        int dc = Math.abs(b.getCol() - a.getCol());
        return (dr <= 1 && dc <= 1) && (dr != 0 || dc != 0);
    }
}
