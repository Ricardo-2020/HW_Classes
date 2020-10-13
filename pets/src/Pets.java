public class Pets {
    private String name;
    private int age;
    private String location;
    private String type;

    // constructors
    public Pets(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // get Methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    // set Methods
    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void setLocation (String type){
        this.type = type;
    }

}
