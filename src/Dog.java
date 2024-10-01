public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        
        return "";
    }
    public void setAge(int age){
        this.age = age;
        
    }
    public int getAge(){
       
        return -1;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
    
        return "";
    }
    public static void main(String[] args) {
        Dog Buster = new Dog("Buster", 4, "Golden Retriever");
        System.out.println(String.format("Name: %s\nAge: %d\nBreed: %s", Buster.getName(), Buster.getAge(), Buster.getBreed()));
    }
}
