public class Array1 {
    public static void main(String[] args) {
        float[] arr = new float[6];// [5]-memory allocation
        arr[0] = 3.2F;
        arr[1] = 2.1F;
        arr[2] = 8.9F;
        arr[3] = 4.9F;
        arr[4] = 9.2F;
        System.out.println("data present at 1st index:" + arr[0]);
        System.out.println("data present at 2nd index:" + arr[1]);
        System.out.println("data present at 3rd index:" + arr[2]);
        System.out.println("data present at 4th index:" + arr[3]);
        System.out.println("data present at 5th index:" + arr[4]);
        System.out.println("data present at 6th index:" + arr[5]);

        float sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println("sum of the array elements/data:" + sum);

    }

}
