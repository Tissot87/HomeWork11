//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author jr = new Author("Joanne", "Rowling");
        Author ar = new Author("Ayn", "Rand");

        Book harryPotterPart1 = new Book("Harry Potter", jr, 1996);
        Book atlasShrugged = new Book("atlasShrugged", ar, 1957);

        harryPotterPart1.setYear(1997);

    }
}