public class Time {
    int hour;
    int minute;
    int second;
    public Time(int h, int m, int s){
        if(h >= 0 && h <= 23 && m >= 0 && m <= 59 && second >= 0 && second <= 59){
            hour = h;
            minute = m;
            second = s;
        }
        else{
            hour = 0;
            minute = 0;
            second = 0;
        }
    }
    public void toStandard(){
        if(hour >= 13 && hour <= 23){
            System.out.println((hour-12 >= 10 ? hour-12 : "0"+(hour-12))+":"+(minute>=10 ? minute : "0"+minute)+":"+(second>=10? second : "0"+second)+" PM");
        } 
        else{
            System.out.println((hour>= 10 ? hour : "0"+hour)+":"+(minute>=10 ? minute : "0"+minute)+":"+(second>=10? second : "0"+second)+" AM");
        }
    }
    
    public void toUniversal(){
        System.out.println((hour>= 10 ? hour : "0"+hour)+":"+(minute>=10 ? minute : "0"+minute)+":"+(second>=10? second : "0"+second));
    }

    public void add(Time t){
        if(this.second + t.second > 59){
            this.second+=t.second;
            this.second-=60;
            this.minute++;
            if(this.minute > 59){
                this.minute-=60;
                this.hour++;
                if(this.hour > 23){
                    this.hour -= 24;
                }
            }
        } else {
            this.second+=t.second;
        }

        if(this.minute + t.minute > 59){
            this.minute += t.minute;
            this.minute -= 60;
            this.hour++;
            if(this.hour > 23){
                this.hour -= 24;
            }
        }
        else{
            this.minute += t.minute;
        }

        if(this.hour + t.hour > 23){
            this.hour+=t.hour;
            this.hour-=24;
        }
        else{
            this.hour += t.hour;
        }
    }


    public static void main(String[] args) {
        Time obj = new Time(8, 58, 7);
        Time t2 = new Time(9, 34, 52);
        obj.toStandard();
        obj.add(t2);
        obj.toUniversal();
    }
}