public class ArmstrongNo {
    public static void main(String[] args) {
        int n=1637,c,rem,arm=0;
        c=n;
        while(n>0);
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;  
        }
        if(c==arm){
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not armstrong no");
        }
    }
}
