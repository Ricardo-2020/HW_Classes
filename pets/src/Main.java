public class Main {
    public static void main(String[] args){
        Pets pet = new Pets("doggie", 4, "Home", "mutt");

        System.out.printf("%s\n", pet.getName());
        System.out.printf("%d\n", pet.getAge());
        System.out.printf("%s\n", pet.getType());

        pet.setName("rex");
        pet.setAge(13);
        pet.setLocation("at park");

        System.out.printf("%s\n", pet.getName());
        System.out.printf("%d\n", pet.getAge());
        System.out.printf("%s\n", pet.getType());
        System.out.printf("%s\n", pet.location());

    }
}
