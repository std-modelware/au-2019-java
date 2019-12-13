package ShopBusiness;

public class Guest {
    private int story;
    private String name;

    public Guest(){
        this.name = "basic";
        this.story = 0;
    }

    public void addstory(int i){
        this.story += i;
        this.name = "platinum";

        if(this.story<=15000){
            this.name = "gold";
        }
        if(this.story<=8000){
            this.name = "silver";
        }
        if(this.story<=1000){
            this.name = "basic";
        }

    }

    public String getName(){
        return this.name;
    }
}
