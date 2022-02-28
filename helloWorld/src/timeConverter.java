public class timeConverter {
    public static void main(String args[]){
        int time24=12;
        int time12=time24%12;
        if(time24<=24){
                System.out.println("12 hour time of " +time24+ "H is : "+((time24==12)?time12+12:time12)+ ((time24<12 || time24==24)?"AM":" PM"));
        }
        else{
            System.out.println("Invalid time...");
        }


    }
}
