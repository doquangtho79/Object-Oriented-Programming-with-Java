package genericprogram;
public class GenDisplayArray {
    public static <T> void displayArray(T[] elements) {
        for (T ele : elements) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] a = { 152312, 158720, 159035, 152244 };
        String[] b = { "Nguyen Van A", "Nguyen Van B", "Nguyen Van C" };
        System.out.print("Mang so bao danh SV: ");
        displayArray(a);
        System.out.print("Mang ten SV: ");
        displayArray(b);
	System.out.println("Finished Excercise!");        
    }  
}
