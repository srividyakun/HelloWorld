public class BlockStatement {
    public static void main(String[] args) {
        int v1 = 10,v2 = 4;
        final int diff;
        final int diff1;
        if(v1>v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2 = " + diff);
        }else
            diff = v2-v1;
        System.out.println("v2 is bigger than v1"+diff);

        if(v1>v2) {
            diff1 = v1 - v2;
            System.out.println("v1 is bigger than v2 = " + diff1);
        }else {
            diff1 = v2 - v1;
            System.out.println("v2 is bigger than v1" + diff1);
        }
    }
}
