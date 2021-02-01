public class BigClass {

    //Standard-värde för number skall vara 0. Standard-värde för text skall vara null.
    private int number;
    private String text;

    public BigClass() {
        this(0, null);
    }

    public BigClass(int num) {
        this.number = num;
    }

    public BigClass(String s) {
        this.text = s;
        this.number = 0;
    }

    public BigClass(int num, String txt) {
        number = num;
        text = txt;
    }

    //setter för number-variabeln. Ett negativt tal skall ej accepteras till setNumber
    public void setNumber(int number) {
        if(number >= 0) {
            this.number = number;
        }
        else {
            System.out.println("The number cannot be negative");
        }

    }

    //Getter för number-variabeln
    public int getNumber(){
        return number;
    }

    //setter för text-variabeln.
    public void setText(String text) {
        this.text = text;
    }

    //Getter för text-variabeln.
    public String getText() {
        return text;
    }

    //En metod för att göra om text-variabeln till stora bokstäver
    public String textToUpperCase(){
        System.out.println(text.toUpperCase());
        return text.toUpperCase();
    }

    //En metod för att göra om text-variabeln till null.
    public String textToNull(){
        text = null;
        return null;
    }

    /*En metod som adderar number med ett nytt tal, och ersätter number-variabeln med
    summan. Ett negativt tal skall ej accepteras*/
    public int addNumber(int newNum){ //
        number = number + newNum;
        return number;
    }

    @Override
    public String toString() {
        return number + " + " + text;
    }
}
