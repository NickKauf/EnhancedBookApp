public class BookClass {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //constructors
    public BookClass() {
        this.title = "Untitled";
        this.author = "No Author";
        this.description = "No Description";
        this.price = 0.00;
        this.isInStock = false;

    }

    public BookClass(String title, String author, String description, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;

    }

    // methods
    public void getDisplayText() {
        System.out.println(title + "\nby: " + author + "\nAbout: " + description);

    }

    public double Subtotal(int copies){
        if(this.isInStock){
            double subTotal = this.price*copies;
            System.out.println(this.title+" x"+copies+" = "+subTotal);

            return subTotal;


        }
        else{
            System.out.println(this.title+": OUT OF STOCK");
            return 0.00;
        }
    }

    //setters and getters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getStock() {
        return this.isInStock;
    }

    public void setStock(boolean stock) {
        this.isInStock = stock;
    }
}

