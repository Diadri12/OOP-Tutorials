package BookSystem;

public class Book implements Comparable <Book>{
    public String Name;
    public double price;
    public int YearPublished;
    public String AuthorName;

    public void BookInformation(String name,double price, int yearPublished,String AuthorName){
        this.Name = name;
        this.price = price;
        this.YearPublished = yearPublished;
        this.AuthorName = AuthorName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(int yearPublished) {
        YearPublished = yearPublished;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                ", YearPublished=" + YearPublished +
                ", AuthorName='" + AuthorName + '\'' +
                '}';
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Book b) {
        int returnvalue = 0;
        if(this.YearPublished > b.YearPublished){
            returnvalue = 1;
        } else{
            returnvalue = -1;
        }
        return returnvalue;
    }
}
