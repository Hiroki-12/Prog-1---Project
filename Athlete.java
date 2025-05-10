/**
 * Represents an athlete who performs activities.
 * Stores personal data including name, age, gender, height, and weight.
 * 
 */
public class Athlete {
    private String name;
    private int age;
    private Gender gender;
    private double height; // in cm
    private double weight; // in kg

    /**
     * Constructs an Athlete with all attributes.
     */
    public Athlete(String name, int age, Gender gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height + " cm" +
                ", weight=" + weight + " kg" +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Athlete)) return false;
        Athlete other = (Athlete) obj;
        return name.equals(other.name) && age == other.age;
    }
}
