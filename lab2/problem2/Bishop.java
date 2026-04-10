public class Bishop extends Piece {

    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b == null || !b.isOnBoard()) return false;
        int dr = Math.abs(b.getNumber() - a.getNumber());
        int dc = Math.abs(b.getBukva() - a.getBukva());
        return dr == dc && dr != 0;
    }
}
