public class problem2 {

    public static void main(String[] args) {

        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());

    }
}

class StarTriangle {

    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        String result = "";

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                result += "[*]";
            }
            result += "\n";
        }

        return result;
    }
}
