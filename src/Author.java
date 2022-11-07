public class Author {
    private String name;

    Author(){
        name = "John";
    }

    Author(String name){
        this.name = name;
    }

    public void SetName(String name)
    {
        this.name = name;
    } 

    public String GetName()
    {
        return name;
    }
}
