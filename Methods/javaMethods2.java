package Methods;

public class javaMethods2 {
    static int arrayCreate(int arr[]){
        arr[0]=56;
        System.out.println(arr[0]);
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={34,52,89,36,30};
        arrayCreate(arr);
        System.out.println("value of mark 1 after change is:"+arr[0]);
    }
}
