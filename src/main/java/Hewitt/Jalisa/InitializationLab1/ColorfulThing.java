package Hewitt.Jalisa.InitializationLab1;

/**
 * Created by jalisahewitt on 9/9/16.
 */


public class ColorfulThing {

    private Color color;

    public enum Color{
        GREEN, BLUE, PURPLE
    }

    public ColorfulThing(Color c){
         this.color = c;
    }



    public Color getColor(){
        return color;

    }
    public void printColor(){
        System.out.println(color);
    }


}

