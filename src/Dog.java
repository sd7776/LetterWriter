public class Dog {
    String name;
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.name = "Bart";
        dog1.bark();

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] =  new Dog();
        dogs[2] = dog1;

        dogs[0].name = "Fred";
        dogs[1].name = "Marge";

        for (int i = 0; i< dogs.length; i++){
            dogs[i].bark();
        }

    }

    public void bark(){
        System.out.println(name +" says Bark");
    }
}
