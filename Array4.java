public class Array4 {
    public static void main(String[] args) {

        // create a java program to add two matrices of size 2*3

        int[][] matrices = new int[2][3];
        matrices[0][0] = 34;
        matrices[0][1] = 45;
        matrices[0][2] = 78;
        matrices[1][0] = 50;
        matrices[1][1] = 73;
        matrices[1][2] = 59;

        int sum = matrices[0][0] + matrices[0][1] + matrices[0][2] + matrices[1][0] + matrices[1][1] + matrices[1][2];
        System.out.println("sum of two matrices is:" + sum);

    }

}
