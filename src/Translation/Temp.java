package Translation;

public class Temp {
    public static int index = 0;


    public Temp(){
        //add new temp
        index++;
    }


    @Override
    public String toString(){

        return String.format("t%d", index);

    }
}