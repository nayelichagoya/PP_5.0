public class Dog
{
    //variables
    private String Name;
    private int Age;
    private String Breed;
    private double Weight;
    static int dogCount;

    //constructors
    public Dog (String Name, int Age, String Breed, double Weight)
    {
        this.Name = Name;
        this.Age = Age;
        this.Breed = Breed;
        this.Weight = Weight;
        dogCount = dogCount + 1;
    }

    public Dog ()
    {
        Name = "";
        Age = 0;
        Breed = "";
        Weight = 0.0;
    }

    //getters
    public String getName()
    {
        return Name;
    }

    public int getAge()
    {
        return Age;
    }

    public String getBreed()
    {
        return Breed;
    }

    public double getWeight()
    {
        return Weight;
    }
    public int getDogCount()
    {
        return dogCount;
    }

    //setters
    public void setName (String needToEx)
    {
        this.Name = Name;
    }
    public void setAge (int Age)
    {
        this.Age = Age;
    }
    public void setWeight (double Weight)
    {
        this.Weight = Weight;
    }
    public void setBreed (String Breed)
    {
        this.Breed = Breed;
    }

    //brain methods
    public double kilograms ()
    {
        return Weight*0.453592;
    }

    //toString
    public String toString()
    {
        String output = "Name: " + Name + " Age: " + Age + " Breed: " + Breed + " Weight: " + Weight;
        return output;
    }
}

