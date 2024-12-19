import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        WebsiteList ss = new WebsiteList();
        ss.add("lllll");
        ss.add("pppppp");
        ss.add("kkkkk");
        ss.add("hhhhhh");
        ss.add("ooooooo");
        System.out.println(ss.display());
        System.out.println(ss.getCurrent().url);
        ss.back();
        System.out.println(ss.getCurrent().url);
        ss.forward();
        System.out.println(ss.getCurrent().url);
        ss.back();
        ss.back();
        ss.back();
        System.out.println(ss.getCurrent().url);
        ss.jumpTo("hhhhhh");
        System.out.println(ss.getCurrent().url);
    }
}