import java.util.*;

public class WebsiteList implements IWebsiteList{
    private Node head ,tail ,current;
    private int size=0;

    public WebsiteList(){

    }
    public Node getCurrent(){
        return current;
    }
    public void add(String url){
        Node newNode =new Node(url);
        current = newNode;

        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }

        size++;
    }
    public String back(){
        if(current == null || current.previous == null){
            throw new NoSuchElementException("No previous page.");
        }else{
            current=current.previous;
            return current.url;
        }

    }
    public String forward(){
        if(current == null || current.previous == null){
            throw new NoSuchElementException("No previous page.");

        }else{
            current = current.next;
            return current.url;
        }

    }
    public String jumpTo(String url){
        Node currentNode = head;
        int c=0;
        while(c < size && !currentNode.url.equals(url)){
            currentNode = currentNode.next;
            c++;
        }
        if(c != size){
            current = currentNode;
            return current.url;
        }else{
            throw new IllegalArgumentException("URL not found in browser history.");
        }


    }
    public String display(){
        StringBuilder allwebsite = new StringBuilder("[ ");
        Node currentNode = head;

        while(currentNode != null){
            if(currentNode.next == null){
                allwebsite.append(currentNode.url+" ]");
            }else{
                allwebsite.append(currentNode.url+", ");
            }
            currentNode = currentNode.next;
        }
        return allwebsite.toString();
    }
}
