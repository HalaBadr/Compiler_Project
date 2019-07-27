public class print_Token {

    public print_Token(int i, String s){
        if (i==50){
            System.out.print("<id," + s + ">");
        }
        else if(i==4){
            System.out.print("<num," + s + ">");

        }
        else if(i ==6) {
            System.out.print("<rel," + s + ">");
        } else{
            System.out.print("<"+ s + ">");

        }
    }
}
