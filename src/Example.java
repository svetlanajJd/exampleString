public class Example {

    public void printWords() {

        String s = "Hello world !";

        //conversion to array
        String[] words = s.split(" ");

        //array output
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);

    }
}
