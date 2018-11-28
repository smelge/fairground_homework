package rides;

public abstract class Attraction {
    protected String name;

    public Attraction(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double defaultPrice(){
        return 5;
    }
}
