package uri.tech.animals;

abstract class Animal {
    public abstract void animalSound();
    public void poop(String name){
        System.out.println(name+" makes poop!");
    }
}
