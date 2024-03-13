public class Array3 {
    public static void main(String[] args) {
        /*
         * calculate the average marks from an array containing marks of all
         * students in physics
         */

        int marks[] = new int[10]; // int []marks = new int[10]

        marks[0] = 66;
        marks[1] = 89;
        marks[2] = 90;
        marks[3] = 97;
        marks[4] = 81;
        marks[5] = 84;
        marks[6] = 87;
        marks[7] = 82;
        marks[8] = 78;
        marks[9] = 70;

        int sum = marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5] + marks[6] + marks[7] + marks[8]
                + marks[9];
        int avg = sum / 10;
        System.out.println("average marks of students in physics:" + avg);
    }
}
