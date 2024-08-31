package Methods;

public class javaMethods1 {
    int calculateAvg(int mathMark,int phyMark,int HindiMark,int ComMark,int SciMark){
        int sum=mathMark+phyMark+HindiMark+ComMark+SciMark;
        int avg=sum/5;
        return avg;
    }
    public static void main(String[] args) {
        javaMethods1 obj=new javaMethods1();
        System.out.println(obj.calculateAvg(99,89,63,73,56));
    }

}
