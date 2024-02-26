public class AnimalFactory {
    public Animal getAnimal(String type){
        if("caniel".equals(type)){
            return new Dog();
        }else{
            return new Cat();
        }
    }
}
