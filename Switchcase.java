class Switchcase{
    public static void main(String args[]){
        int day=3;
        String dayname;
        switch (day) {
            case 1:
                dayname="today is monday";
                break;
             case 2:
                dayname="today is tuesday";
                break;
                case 3:
                dayname="today is wednesday";
                break;
             case 4:
                dayname="today is thursday";
                break;
            case 5:
                dayname="today is friday";
                break;
             case 6:
                dayname="today is saturday";
                break;
            case 7:
                dayname="today is sunday";
                break;
            default :
                dayname="invalid day number to access dayname";
                break;
            
        }
        System.out.print(dayname);
    }
}