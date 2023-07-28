public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed){
        //TODO STUDENT
    }
    public void setName(String name){
        //TODO STUDENT
    }
    public String getName(){
        //TODO STUDENT
        return "";
    }
    public void setAge(int age){
        //TODO STUDENT
    }
    public int getAge(){
        //TODO STUDENT
        return -1;
    }
    public void setBreed(String breed){
        //TODO STUDENT
    }
    public String getBreed(){
        //TODO STUDENT
        return "";
    }
    public static void main(String[] args) {
        Dog Buster = new Dog("Buster", 4, "Golden Retriever");
        System.out.println(String.format("Name: %s\nAge: %d\nBreed: %s", Buster.getName(), Buster.getAge(), Buster.getBreed()));
    }
}
