public class Child {
    private String name;
    private int age;
    private double bedtime;
    private String sport;
    private String favColor;

    public Child(String name, int age, double bedtime, String sport, String favColor){
        //TODO STUDENT
    }
    public void setName(String name){
        //TODO STUDENT
    }
    public String getName() {
        //TODO STUDENT
        return "";
    }
    public void setAge(int age) {
        //TODO STUDENT
    }
    public int getAge(){
        //TODO STUDENT
        return -1;
    }
    public void setBedtime(double bedtime){
        //TODO STUDENT
    }
    public double getBedtime() {
        //TODO STUDENT
        return -1.0;
    }
    public void setSport(String sport){
        //TODO STUDENT
    }
    public String getSport(){
        //TODO STUDENT
        return "";
    }
    public void setFavColor(String favColor){
        //TODO STUDENT
    }
    public String getFavColor(){
        //TODO STUDENT
        return "";
    }
    public static void main(String[] args) {
        Child Roman = new Child("Roman", 8, 9.30, "baseball", "yellow");
        System.out.println(String.format("Meet %s. They are %d years old.\nThey go to bed at %d:%d every night.\nThey play %s, and their favorite color is %s.", Roman.getName(), Roman.getAge(), (int)Roman.getBedtime(), (int)((Roman.getBedtime() - (int) Roman.getBedtime()) * 100), Roman.getSport(), Roman.getFavColor()));
    }
}
