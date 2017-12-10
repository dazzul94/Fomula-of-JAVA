package ch05;

public class ArrayEx10 {
    public static void main(String[] args) {
        int [] numArr = new int[10];
        
        initArr(numArr);
        printArr(numArr);
        sortArr(numArr);
        
    }//end of main
    static void sortArr(int[] numArr) {
        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;
            
            for (int j = 0; j <numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            }//end of j
            if (!changed) break;
            
            printArr(numArr);
            
        }// end of i
        
    }
    static void initArr(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10);
        }
        
    }
    static void printArr(int[] numArr) {
        for (int k =0; k < numArr.length; k++) 
            System.out.print(numArr[k]);
        System.out.println();
    }
    

}
