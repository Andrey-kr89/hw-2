public class NameEncoderDecoder
{
    public static void main(String[] args) {

    }

    public String encode(String name) {
        name = name.replaceAll("e", "1");
        name = name.replaceAll("u", "2");
        name = name.replaceAll("i", "3");
        name = name.replaceAll("o", "4");
        name = name.replaceAll("a", "5");
        return "NOTFORYOU"+name+"YESNOTFORYOU";


    }



    public String decode(String name) {
        name = name.replaceAll("1", "e");
        name = name.replaceAll("2","u");
        name = name.replaceAll("3","i");
        name = name.replaceAll("4","o");
        name = name.replaceAll("5","a");
        name = name.replace("YESNOTFORYOU","");
        name = name.replace("NOTFORYOU","");

        return name;

    }

}
