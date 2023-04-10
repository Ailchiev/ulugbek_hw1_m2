public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("vasiliy", "Овчарка", Color.BLACK, new Shelter("Приют №1", "Ак Ордо"), 11);
        Dog dog2 = new Dog(11, new Shelter("Приют Бишкека", "Заповедник "));
        Dog dog3 = new Dog("November", "Кавказ", Color.BROWN,
                new Shelter("Best shelter", "Япония"),"сидеть", 9);
        Pet pet= new Pet(10, new Shelter("Приют №5", "Балыкчы"));
        System.out.println(dog1.printInfo());
        System.out.println(dog2.printInfo());
        System.out.println(dog3.printInfo());
        System.out.println(pet.getInfo());
    }
}