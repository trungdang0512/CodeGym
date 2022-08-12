package exercise01.SS07_AbstractClass_Interface.bai_tap.colorable;

public class RecTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( "blue", true, 2.0,2.0 );

        System.out.println(rectangle);

        if (rectangle.isFilled() == true){
            System.out.println(rectangle.howToColor());
        }
    }
}
