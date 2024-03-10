package Lektii.Lektii01;

public class Masivu {
    public static void main(String[] args) {
//***********************************************************************/
//                  ОДНОМЕРНЫЕ МАССИВЫ
//**********************************************************************/


//        int[] arr = new int[20];
//        System.out.println(arr.length);
//
//
//        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(arr.length);

//************************************************************************/
//                  МНОГОМЕРНЫЕ МАССИВЫ
//************************************************************************/
//                      Exemple 1


//        int[] arr[] = new int[10][20];
//        for (int[] line : arr) {
//            for (int item : line) {
//                System.out.printf("%d ", item);
//            }
//            System.out.println();
//        }
//*******************************************************************/
//                   Exemple 2


        int[][] arr = new int[10][20];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

//**********************************************************************/




    }
}
