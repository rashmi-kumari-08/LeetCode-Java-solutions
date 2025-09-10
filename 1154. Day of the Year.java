// Optimal 99%
class Solution {
    static final int[] days = new int[]{0,31,59,90,120,151,181,212,243,273,304,334,365};
    public int dayOfYear(String date) {
		var month = (date.charAt(5) - 48) * 10 + date.charAt(6) - 48;
		var day = (date.charAt(8) - 48) * 10 + date.charAt(9) - 48;
        var sum = days[month-1] + day;
        if (month < 3)
            return sum;

        var year = (date.charAt(2) - 48) * 10 + (date.charAt(3) - 48);
        var isLeap = year != 0;
        var half = ((date.charAt(0) - 48) * 10 + (date.charAt(1) - 48));
        year += half * 100;
        if (year % 4 == 0 && (isLeap || half % 4 == 0))
            return sum + 1;
        return sum;
    }
}


// optimal 
class Solution {
 public int dayOfYear(String date) {

       
       int year  = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day   = Integer.parseInt(date.substring(8, 10));

        int[] m = {31,isLeapYear(year),31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
            day +=m[i];
        }
        return day;
    }


    private int isLeapYear(int n){
        if((n%400==0 )||( n%100!=0 && n%4==0)){
            return 29;
        }else 
        return 28;
    }
}


//Brute force
class Solution {
 public int dayOfYear(String date) {

        String[] str = date.split("-");
        int days =0;
        int year =Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day =Integer.parseInt(str[2]);

        int[] m = {31,isLeapYear(year),31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
            day +=m[i];
        }
        return day;
    }


    private int isLeapYear(int n){
        if((n%400==0 )||( n%100!=0 && n%4==0)){
            return 29;
        }else 
        return 28;
    }
}
