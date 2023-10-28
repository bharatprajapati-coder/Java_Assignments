public class Question10 {
    public static void main(String args[])
    {
        System.out.println("Bharat Prajapati \n Roll no : 3058" );
        StringBuffer string = new StringBuffer("Hello");
        string.append("World");
        System.out.println("After appending the text :" + string);
        string.insert(5 , "java");
        System.out.println("After Inserting the text : " + string);
        string.delete(5, 7);
        System.out.println("After deleting some text: " + string);
        string.replace(0, 4,"Bye Bye: ");
        System.out.println("After the replacing the string: " + string);
        string.reverse();
        System.out.println("After reversing the text : " + string);
        String res = string.toString();
        System.out.println("after converting the string :  " + res);
    }
}
