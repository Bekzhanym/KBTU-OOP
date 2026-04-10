public class Queen extends Piece {

    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b == null || !b.isOnBoard()) return false;
        int dr = Math.abs(b.getNumber() - a.getNumber());
        int dc = Math.abs(b.getBukva() - a.getBukva());
        if (dr == 0 && dc == 0) return false;
        return dr == 0 || dc == 0 || dr == dc;
    }
}
