public class TextConverter {
    public static String defaultText = "Lorem Ipsum is simply dummy text of the printing";
            /*+ " and typesetting industry. Lorem Ipsum has been the industry's standard "
            + "dummy text ever since the 1500s, when an unknown printer took a galley of "
            + "type and scrambled it to make a type specimen book. It has survived not only five centuries, "
            + "but also the leap into electronic typesetting, remaining essentially unchanged. "
            + "It was popularised in the 1960s with the release of Letraset sheets containing "
            + "Lorem Ipsum passages, and more recently with desktop publishing software like "
            + "Aldus PageMaker including versions of Lorem Ipsum.";*/


    static String textLine = "";
    int maxLineLength = 21;

    public void getFinalText(String s) {

        for (int i = 0; i < 4; i++) {

            if (textLine.length() < maxLineLength) {
                s = defaultText;
                int indexOfSpace = s.indexOf(" ");
                textLine = textLine + " " + s.substring(0, indexOfSpace);
                defaultText = s.substring(indexOfSpace+1);
                System.out.println(textLine);
                System.out.println(textLine.length());
                System.out.println(defaultText);

            }else {
                System.out.println("*-*-*-*-*-*-*-*-*-*");
            }

        }

    }
    public static void main (String[]args){
        TextConverter textConverter = new TextConverter();
        textConverter.getFinalText(defaultText);
    }
}