public class dogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Austailian Shepherd", 45);
        Dog dog3 = new Dog("Coco", 5, "Maltipoo", 50);

        System.out.println("Breed: "+ dog1.getBreed());
        System.out.println("Age: " + dog1.getAge());
        System.out.println("Weight: " + dog2.getWeight());
        System.out.println("In kilograms: " + dog2.kilograms());
        System.out.println(dog3);
        System.out.println("There are " + dog3.getDogCount()+ " dogs.");
    }
}
