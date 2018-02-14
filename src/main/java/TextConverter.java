public class TextConverter {
    public static String defaultText = "Lorem Ipsum is simply dummy text of the printing"
            + " and typesetting industry. Lorem Ipsum has been the industry's standard ";
            /*+ "dummy text ever since the 1500s, when an unknown printer took a galley of "
            + "type and scrambled it to make a type specimen book. It has survived not only five centuries, "
            + "but also the leap into electronic typesetting, remaining essentially unchanged. "
            + "It was popularised in the 1960s with the release of Letraset sheets containing "
            + "Lorem Ipsum passages, and more recently with desktop publishing software like "
            + "Aldus PageMaker including versions of Lorem Ipsum.";*/


    static String textLine = "";
    static int maxLineLength = 21;
    static int lineCount = 0;
    static int wordCount = 0;

    public static String getFinalText(String defaultText) {
        if(lineCount < 4) {
            if (textLine.length() < maxLineLength) {
                if (wordCount < 4) {
                    int indexOfSpace = defaultText.indexOf(" ");
                    textLine = textLine + " " + defaultText.substring(0, indexOfSpace);
                    defaultText = defaultText.substring(indexOfSpace + 1);
                    wordCount++;

                }System.out.println(textLine);
                textLine = "";
                /*else{
                    wordCount = 0;
                    System.out.println(textLine + " \n");
                }*/
            }lineCount++;

        }else {
            System.out.println(textLine);
            System.out.println("*-*-*-*-*-*-*-*-*-*");
            lineCount = 0;
        }
        return textLine;
    }


    public static void main (String[]args){
        TextConverter textConverter = new TextConverter();
        textConverter.getFinalText(defaultText);
    }
}