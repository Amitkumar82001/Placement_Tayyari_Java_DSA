package Homework._11_06_;

public class totalSuraceAreaOfCuboid {

//Total Surface Area of Cuboid = 2 (lw + wh + lh)
//Sum of areas of all 6 faces of cuboid
//If l = 4, w = 3, h = 2, then
//TSA = 2(4 × 3 + 3 × 2 + 4 × 2) = 52 cm2

    public static void main(String[] args) {

        int l = 4, w = 3, h = 2;

        int totalSurfaceArea = 2 * (l * w + w * h + l * h);
        System.out.println(totalSurfaceArea);

    }


}
