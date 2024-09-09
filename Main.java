package ora01;

public class Main {
    public static void bubbleSort() {
        int nums[] = {5, 1, 6, 2, 4, 3};
        int size = nums.length;
        int temp = 0;

        for (int i = 0; i < size; i++) { // %%
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp; // Swapping elements
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("barack");
        bubbleSort();
    }
}