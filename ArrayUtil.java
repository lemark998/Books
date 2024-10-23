public class ArrayUtil {
    public static void main(String[] array) {
        // int[] array = {1,2,3,4,5,6,7,8};
        
        //REVERSE: 
        //array[0] = 1 --> length - 0(i) - 1 = 8 - 0 - 1 = 7 (array[7] = 8)
        //ARRAY STATE: {8,2,3,4,5,6,7,1}

        //array[1] = 2 --> length - 1(i) - 1 = 8 - 1 - 1 = 6 (array[6] = 7)
        //ARRAY STATE: {8,7,3,4,5,6,2,1}

        //array[2] = 3 --> length - 2(i) - 1 = 8 - 2 - 1 = 5 (array[5] = 6)
        //ARRAY STATE: {8,7,6,5,4,3,2,1}

        int length = array.length; 

        for(int i = 0; i < length / 2; i++){
            String temp = array[i];
            array[i] = array[length - i - 1];
            temp = array[length - i - 1]
        }
    }
}
