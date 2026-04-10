public class Position {

    private int number;
    private int bukva;

    public Position(int number, int bukva) {
        this.number = number;
        this.bukva = bukva;
    }

    public int getNumber() {
        return number;
    }

    public int getBukva() {
        return bukva;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBukva(int bukva) {
        this.bukva = bukva;
    }

    public boolean isOnBoard() {
        return number >= 0 && number <= 7 && bukva >= 0 && bukva <= 7;
    }

    @Override
    public String toString() {
        return "(" + number + "," + bukva + ")";
    }
}
