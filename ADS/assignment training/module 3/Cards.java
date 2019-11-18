public class Cards implements Comparable<Cards> {
    int num;
    int suits;

    Cards(int num, int suits) {
        this.num = num;
        this.suits = suits;
    }

    public int compareTo(Cards that) {
        if (this.suits < that.suits) {
            return -1;
        } else if (this.suits > that.suits) {
            return 1;
        } else {
            if (this.num < that.num) {
                return -1;

            } else if (this.num > that.num) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public String toString() {
        String s = " ";
        if (this.suits == 1) {
            s = " " + "spades";
        } else if (this.suits == 2) {
            s = " " + "Hearts";
        } else if (this.suits == 3) {
            s = " " + "clubs";
        } else if (this.suits == 4) {
            s = " " + "Diamond";
        }

        if (this.num == 1) {
            return "A" + " " + s;
        } else if (this.num == 11) {
            return "J" + " " + s;
        } else if (this.num == 12) {
            return "Q" + " " + s;
        } else if (this.num == 13) {
            return "K" + " " + s;
        } else {
            return this.num + " " + s;
        }
    }
}