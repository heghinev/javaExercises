public class TextConverter {
    public static String defaultText = "Lorem Ipsum is simply dummy text of the printing";
            /*+ " and typesetting industry. Lorem Ipsum has been the industry's standard "
            + "dummy text ever since the 1500s, when an unknown printer took a galley of "
            + "type and scrambled it to make a type specimen book. It has survived not only five centuries, "
            + "but also the leap into electronic typesetting, remaining essentially unchanged. "
            + "It was popularised in the 1960s with the release of Letraset sheets containing "
            + "Lorem Ipsum passages, and more recently with desktop publishing software like "
            + "Aldus PageMaker including versions of Lorem Ipsum.";*/


int i = 0;
String finalText = "";
int maxFinalTextLength = 21;

public String getFinalText(String defaultText){

    if (finalText.length() < maxFinalTextLength) {
        if (i < 4) {
            int indexOfSpace = defaultText.indexOf(" ");
            finalText = finalText + defaultText.substring(0, indexOfSpace);
            defaultText = defaultText.substring(indexOfSpace);

            System.out.println(finalText);
            System.out.println(defaultText);
        }
    }i++;

    return finalText;
}

    public static void main(String[] args) {
        TextConverter textConverter = new TextConverter();
        textConverter.getFinalText(defaultText);
    }

}
