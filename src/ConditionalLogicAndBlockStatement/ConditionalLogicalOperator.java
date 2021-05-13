package ConditionalLogicAndBlockStatement;

public class ConditionalLogicalOperator {
    public static void main(String[] args) {
        int students = 50;
        int rooms = 1;

        if(rooms!=0 && students/rooms >30)
            System.out.println("checks rightside condition when needed");


        if(rooms!=0 & students/rooms >30)
            System.out.println("checked both right and left side conditions");

    }
}
