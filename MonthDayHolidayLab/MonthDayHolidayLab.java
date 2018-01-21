import java.util.*;

public class MonthDayHolidayLab{
   public static void main(String[] args) {
      printDirections();
      Scanner console = new Scanner(System.in);
      int x;
      int m = 0;
      String q = " ";
      System.out.print("How many times do you want to run the program: ");
      if(console.hasNextInt()) {
         x = console.nextInt();
      } 
      else {
         x = 0;
      }
        
      for(int i = 1; i <= x; i++) {
         
         System.out.print("Enter the month: ");
         if(console.hasNextInt()) {
            m = console.nextInt();
            q = getMonthString(m);
         } 
         else if(console.hasNext()) {
            q = console.next();
            m = getMonthNumber(q);
         }
         System.out.print("Enter the day: ");
         int day = console.nextInt();
         System.out.print("Enter the year: ");
         int year = console.nextInt();
         System.out.println();
         System.out.print("The Date is: " + m + "/" + day + "/" + year);
         System.out.print(" " + q + " " + day + ", " + year + " " + getHoliday(m,day,year));
         System.out.println();
         System.out.println();      
            
      }
      
   } 
   public static void printDirections() {
      System.out.println("This program will ask you for a month, day, and year");
      System.out.println("and will print the corresponding date in two standard date formats.");
      System.out.println("You may enter the month as: ");
      System.out.println("    * a numerical value (1..12)");
      System.out.println("        or as");
      System.out.println("    * an unabbreviated month name (January or February etc....");
   }
                                
   public static String getMonthString(int month) {
      String stringmonth;
      //switch method for months
      switch (month) {
         case 1: 
            stringmonth = "January";
            break;
         case 2: 
            stringmonth = "February";
            break;
         case 3: 
            stringmonth = "March";
            break;
         case 4: 
            stringmonth = "April";
            break;
         case 5: 
            stringmonth = "May";
            break;
         case 6:
            stringmonth = "June";
            break;
         case 7: 
            stringmonth = "July";
            break;
         case 8: 
            stringmonth = "August";
            break;
         case 9: 
            stringmonth = "September";
            break;
         case 10: 
            stringmonth = "October";
            break;
         case 11:  
            stringmonth = "November";
            break;
         case 12: 
            stringmonth = "December";
            break;
         default: 
            stringmonth = "Invalid month";
            break;
      
      }
      return stringmonth;
   }
   public static int getMonthNumber(String month) {
      int intday;
      switch (month) {
         case "January": 
            intday = 1;
            break;
         case "February": 
            intday = 2;
            break;
         case "March": 
            intday = 3;
            break;
         case "April": 
            intday = 4;
            break;
         case "May": 
            intday = 5;
            break;
         case "June":
            intday = 6;
            break;
         case "July": 
            intday = 7;
            break;
         case "August": 
            intday = 8;
            break;
         case "September": 
            intday = 9;
            break;
         case "October": 
            intday = 10;
            break;
         case "November":  
            intday = 11;
            break;
         case "December": 
            intday = 12;
            break;
         default: 
            intday = 0;
            break;
      
      }
      return intday;
   
     
   
   }
   public static String getHoliday (int m, int day, int year) {
      String holiday;
      //switch method for holidays
      switch (m) {
         case 1: 
            switch (day) {
               case 1: 
                  holiday = "New Year's Day";
                  break; 
               case 18:
                  holiday = "Martin Luther King Jr. Day";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 2: 
            switch (day) {
               case 2: 
                  holiday = "Ground Hog Day";
                  break; 
               case 12:
                  holiday = "Abraham Lincoln's Birthday";
                  break;
               case 14:
                  holiday = "St. Valentine's Day";
                  break;
               case 22: 
                  holiday = "George Washington's Birthday";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 3: 
            switch (day) {
               case 17: 
                  holiday = "St. Patrick's Day";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 4: 
            switch (day) {
               case 1: 
                  holiday = "April Fool's Day";
                  break; 
               case 4:
                  holiday = "Grandma's Birthday";
                  break;
               case 22:
                  holiday = "Earth Day";
                  break;
               case 30: 
                  holiday = "Arbor Day";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 5: 
            switch (day) {
               case 1: 
                  holiday = "May Day";
                  break; 
               case 5:
                  holiday = "Cinco De Mayo";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 7: 
            switch (day) {
               case 4: 
                  holiday = "Independence Day";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 8: 
            switch (day) {
               case 1: 
                  holiday = "International Friendship Day";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 10: 
            switch (day) {
               case 1: 
                  holiday = "Columbus Day";
                  break; 
               case 31:
                  holiday = "Halloween";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 11: 
            switch (day) {
               case 11: 
                  holiday = "Veter1an's Day";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         case 12: 
            switch (day) {
               case 25: 
                  holiday = "Christmas";
                  break; 
               case 31:
                  holiday = "New Year's Eve";
                  break;
               default: 
                  holiday = "Invalid Holiday";
                  break;
            }
            break;
         default: 
            holiday = "Invalid holiday";
            break;         
      }
      if(isEaster(m,day,year))
      {
         if(holiday.length() != 0){ 
            holiday = "Easter and " + holiday;
         }
         else
         {
            holiday = "Easter";
         }
      }
   
      if((m == 12) && (day == 21))
         if(holiday.length() != 0) {
            holiday = holiday + " and someones's Birthday";
         }
      return holiday;
   
      
   }
   //boolean method to determine if it is Easter or not
   public static boolean isEaster(int m, int day, int year) {
      int goldenNumber = (year % 19) + 1;
      int a = (24 + 19 * (goldenNumber -1)) % 30;
      int b = a - a/28;
      int c = (year + year/4 + b - 13) % 7;
      int d = b - c;
      int easterMonth = 3 + (d + 40)/44;
      int easterDay = d + 28 - 31 * (easterMonth/4);
      if((easterMonth == m)&& (easterDay == day))//will print only if Easter is happenning  
         return true;
      else
         return false;
   }

}
