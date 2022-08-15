public class Main {
    public static void main(String[] args) {
        task12();
        task3();
        task4();
    }

    private static void task12() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i]);
                continue;
            }
            System.out.print(arr1[i] + ", ");
        }
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
                continue;
            }
            System.out.print(arr2[i] + ", ");
        }

        boolean[] arr3 = new boolean[4];
        arr3[0] = 3 < 4;
        arr3[1] = false;
        arr3[2] = 7 > 4 && 8 > 9;
        arr3[3] = true;
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.println(arr3[i]);
                continue;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
    }

    private static void task3() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr1[i]);
                continue;
            }
            System.out.print(arr1[i] + ", ");
        }
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr2[i]);
                continue;
            }
            System.out.print(arr2[i] + ", ");
        }

        boolean[] arr3 = new boolean[4];
        arr3[0] = 3 < 4;
        arr3[1] = false;
        arr3[2] = 7 > 4 && 8 > 9;
        arr3[3] = true;
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr3[i]);
                continue;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
    }

    private static void task4() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i]++;
            }
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                continue;
            }
            System.out.print(arr1[i] + ", ");
        }
    }
}
