public class Array8 {
   public static void main(String[] args) {
      //Multidimensional array

      int[][] marks = new int[2][3];
      marks[0][0] = 56;
      marks[0][1] = 59;
      marks[0][2] = 55;
      marks[1][0] = 57;
      marks[1][1] = 54;
      marks[1][2] = 51;

      System.out.println(marks[0][1]);

      for(int i=0;i< marks.length;i++){
         for(int j=0;j< marks.length;j++) {
            System.out.print(marks[i][j]);
            System.out.print(" ");
         }
         System.out.println(" ");
      }

   }
}
