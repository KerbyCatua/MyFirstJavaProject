public enum Size {
    SMALL("Small Coffee"), MEDIUM("Medium Coffee"), LARGE("Large Coffee");

    String size;

    Size(String sizeWithLabel){
        this.size = sizeWithLabel;
    }

    public String getSize() {
        return size;
    }

}
