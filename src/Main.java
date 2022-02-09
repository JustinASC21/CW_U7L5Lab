import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numArrayList = new ArrayList<Integer>(Arrays.asList(3, -2, 9, 38, -23, 100));
        System.out.println("Tests of linear search ArrayList:");
        System.out.println(Search.linearSearchArrayList(numArrayList, 3));
        System.out.println(Search.linearSearchArrayList(numArrayList, 9));
        System.out.println(Search.linearSearchArrayList(numArrayList, -23));
        System.out.println(Search.linearSearchArrayList(numArrayList, 99));

        System.out.println("Tests of linear search string array:");
        String[] arr1 = {"blue", "red", "purple", "green"};
        System.out.println(Search.linearSearch(arr1, "purple"));
        System.out.println(Search.linearSearch(arr1, "pink"));

    }
}
