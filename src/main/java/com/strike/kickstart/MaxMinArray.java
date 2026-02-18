import java.util.Arrays;
public class MaxMinArray {
    public static void main(String[] args) {

        int [] arr = {5,2,8,1,9,3};

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Maximum = "+max+","+"Minimum = "+min);
    }

}
