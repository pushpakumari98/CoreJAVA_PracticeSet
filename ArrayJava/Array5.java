public class Array5 {
    public static void main(String[] args) {
        // write a java program to reverse an array

        System.out.println("printing array in naive way");
        String array[]=new String[5];
        array[0]="pushpa";
        array[1]="Neha";
        array[2]="Ayushi";
        array[3]="Zoha";
        array[4]="Mrinalini";
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        System.out.println();

        System.out.println("Displaying array using for loop");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("Displaying array using for each loop");
        for(String element:array){
            System.out.println(element);
        }
    }
}
