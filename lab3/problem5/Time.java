/**
 * Вариант из week 2 (practice2) + Comparable.
 * В конструкторе исправлена проверка секунд (раньше сравнивали с полем second до присваивания).
 */
public class Time implements Comparable<Time> {

    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            hour = h;
            minute = m;
            second = s;
        } else {
            hour = 0;
            minute = 0;
            second = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public int compareTo(Time o) {
        int c = Integer.compare(hour, o.hour);
        if (c != 0) {
            return c;
        }
        c = Integer.compare(minute, o.minute);
        if (c != 0) {
            return c;
        }
        return Integer.compare(second, o.second);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void toStandard() {
        if (hour >= 13 && hour <= 23) {
            int h12 = hour - 12;
            System.out.println((h12 >= 10 ? h12 : "0" + h12) + ":"
                    + (minute >= 10 ? minute : "0" + minute) + ":"
                    + (second >= 10 ? second : "0" + second) + " PM");
        } else {
            System.out.println((hour >= 10 ? hour : "0" + hour) + ":"
                    + (minute >= 10 ? minute : "0" + minute) + ":"
                    + (second >= 10 ? second : "0" + second) + " AM");
        }
    }

    public void toUniversal() {
        System.out.println((hour >= 10 ? hour : "0" + hour) + ":"
                + (minute >= 10 ? minute : "0" + minute) + ":"
                + (second >= 10 ? second : "0" + second));
    }

    public void add(Time t) {
        if (this.second + t.second > 59) {
            this.second += t.second;
            this.second -= 60;
            this.minute++;
            if (this.minute > 59) {
                this.minute -= 60;
                this.hour++;
                if (this.hour > 23) {
                    this.hour -= 24;
                }
            }
        } else {
            this.second += t.second;
        }

        if (this.minute + t.minute > 59) {
            this.minute += t.minute;
            this.minute -= 60;
            this.hour++;
            if (this.hour > 23) {
                this.hour -= 24;
            }
        } else {
            this.minute += t.minute;
        }

        if (this.hour + t.hour > 23) {
            this.hour += t.hour;
            this.hour -= 24;
        } else {
            this.hour += t.hour;
        }
    }
}
