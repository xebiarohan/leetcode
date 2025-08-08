package TwoDArray;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {

       for(int[] innerArray: image) {
           int front = 0;
           int last = innerArray.length-1;

           while (front < last) {
               int temp = innerArray[front];
               innerArray[front] = innerArray[last] == 1 ? 0 : 1;
               innerArray[last] = temp == 1 ? 0 : 1;
               front++;
               last--;
           }
           if(front == last) {
               innerArray[front] = innerArray[front] == 1 ? 0 : 1;
           }
       }

       return image;
    }
}
