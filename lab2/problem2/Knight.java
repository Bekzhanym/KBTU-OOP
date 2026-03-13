public class Knight extends Piece {

    public Knight(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b == null || !b.isOnBoard()) return false;
        int dr = Math.abs(b.getRow() - a.getRow());
        int dc = Math.abs(b.getCol() - a.getCol());
        return (dr == 2 && dc == 1) || (dr == 1 && dc == 2);
    }
}
