
//Part 1: Rectangle
public class Rectangle {
    int length ;
    int width ;

    public Rectangle (int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }

    public int calculateArea(int length, int width){
        int area = length*width;
        return area;
    }

    public boolean isSquare(int length, int width){
       if( length == width){
           return true;
       }else {
           return false;
       }
    }
}


