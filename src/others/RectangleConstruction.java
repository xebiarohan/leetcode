package others;

public class RectangleConstruction {
    public static void main(String[] args) {
        System.out.println(constructRectangle(122122));
    }
    public static int[] constructRectangle(int area) {
        int sqrt = (int) Math.sqrt(area);

        while (sqrt > 0) {
            if(area%sqrt == 0) {
                return new int[]{(int) (area/sqrt), (int) sqrt};
            }
            sqrt--;
        }

        return new int[]{area,1};
    }
}
