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
    int maxLineLength = 21;
    int lineCount = 0;
    //int j = 0;
    public int i;

    public void getFinalText(String defaultText) {
        if(lineCount < 4) {

            if (textLine.length() < maxLineLength) {
                for (i = 0; i < 4; i++) {
                    int indexOfSpace = defaultText.indexOf(" ");
                    textLine = textLine + " " + defaultText.substring(0, indexOfSpace);
                    defaultText = defaultText.substring(indexOfSpace + 1);

                    //System.out.println(textLine.length());
                    //System.out.println(defaultText);
                }
                String newLine = System.getProperty("line.separator");
                //System.out.println(textLine + newLine);
                System.out.println(textLine + newLine + "^^^^^^^^^");
            }lineCount++;
        }else {
           System.out.println("*-*-*-*-*-*-*-*-*-*");
        }

    }
    public static void main (String[]args){
        TextConverter textConverter = new TextConverter();
        textConverter.getFinalText(defaultText);
    }
}