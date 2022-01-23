public class ListLength {
    public static void lengthOfList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            
        }
        System.out.println("The length of your list is " + list.length + " objects.");
    }
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        lengthOfList(myList);
    }
}
