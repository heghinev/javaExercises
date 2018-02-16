public class TextConverter {
    private static String defaultText = "Lorem Ipsum is simply dummy text of the printing"
            + " and typesetting industry. Lorem Ipsum has been the industry's standard "
            + "dummy text ever since the 1500s, when an unknown printer took a galley of "
            + "type and scrambled it to make a type specimen book. It has survived not only five centuries, "
            + "but also the leap into electronic typesetting, remaining essentially unchanged. "
            + "It was popularised in the 1960s with the release of Letraset sheets containing "
            + "Lorem Ipsum passages, and more recently with desktop publishing software like "
            + "Aldus PageMaker including versions of Lorem Ipsum.";


    static String textLine = "";
    static int lineCount = 0;
    static int maxLineLength = 21;

    public static String getFinalText(String defaultText) {
        while(lineCount < 4) {
            lineCount++;
            if (textLine.length() < maxLineLength) {
                for (int wordCount = 0; wordCount < 4; wordCount++){
                    int indexOfSpace = defaultText.indexOf(" ");
                    textLine = textLine + " " + defaultText.substring(0, indexOfSpace);
                    defaultText = defaultText.substring(indexOfSpace + 1);
                }
                System.out.println(textLine);
                textLine = "";
            }else{
                System.out.println(textLine);
                textLine = "";
            }
            if(lineCount == 4){
                lineCount = 0;
                System.out.println("*-*-*-*-*-*-*-*-*-*");
            }
        }
        return textLine;
    }


    public static void main (String[]args){
        TextConverter textConverter = new TextConverter();
        textConverter.getFinalText(defaultText);
    }
}

/*try {
                        textLine = textLine + " " + defaultText.substring(0, indexOfSpace);
                    }catch (StringIndexOutOfBoundsException e){
                        textLine = textLine + " " + defaultText;
                    }*/

