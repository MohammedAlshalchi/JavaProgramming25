package day47_Polymorphism;

public class EncapsulationReview {


    private String bookTitle;
    private final String publishedDate;// NO setter method because of the final


    public EncapsulationReview(String bookTitle, String ublishedDate) {
      //  this.bookTitle = bookTitle; will use the origial data
        setBookTitle(bookTitle);// to use the new data with the condition
        this.publishedDate = ublishedDate;
    }


    public String getBookTitle() {// return type data ( String )should match with the variable type(String)
        // to read the data and we can set condition (NOT USE A LOT)
        if(bookTitle == null){
            return "";
            // null means NO object
            // "" means there is object
        }
        return bookTitle;
    }

    public String getUblishedDate() {
        return publishedDate;
    }

    public void setBookTitle(String bookTitle) {// void because no need for return value just for set rules and
        // have parameters because we need new variables
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }


}
