public class BigClass {

    //Standard-värde för number skall vara 0. Standard-värde för text skall vara null.
    private int number; // ska man bara deklarera dem här eller ge utgångsvärde?
    private String text = null;

    public BigClass() { // ska man ha utgångsvärde här?
        this(0);

    }

    public BigClass(int num) {
        this.number = num;
    }

    public BigClass(String string) {
        this.text = string;
    }

    public BigClass(int num, String txt) {
        // this(num2, text2); // kanske så? men då kommer det upp "recursive constructor invocation" error
        number = num;
        text = txt;

    }

    //setter för number-variabeln. Ett negativt tal skall ej accepteras till setNumber
    public void setNumber(int number) {
        if(number >= 0) {
            this.number = number;
        }
    }

    public int getNumber(){  //Getter för number-variabeln
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

    public String textToUpperCase(){ //En metod för att göra om text-variabeln till stora bokstäver
        text = "Hello World!";
        System.out.println(text.toUpperCase());
        return text.toUpperCase();
    }

    public boolean textToNull(){  //En metod för att göra om text-variabeln till null.
        text = "We are best";
        System.out.println(text.isEmpty());
        return text.isEmpty();
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
