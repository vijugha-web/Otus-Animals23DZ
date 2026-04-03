import animals.Animal;
import animals.AnimalType;
import animals.Command;
import animals.factory.AnimalFactory;
import animals.input.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AnimalApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        AnimalFactory factory = new AnimalFactory();

        Scanner scanner = new Scanner(System.in);
        Command currentCommand = null;

        do{

            currentCommand = CommandInput.getCommand(scanner);

            if (currentCommand == Command.LIST){
                if (animals.isEmpty()){
                    System.out.println("Список пуст");
                }
                for (Animal animal : animals){
                    System.out.println(animal);
                }
            } else if (currentCommand == Command.ADD){


                AnimalType animalType = AnimalTypeInput.getAnimalType(scanner);
                Animal animal = factory.create(animalType);

                animal.setName(NameInput.getName(scanner));
                animal.setAge(AgeInput.getAge(scanner));
                animal.setWeight(WeightInput.getWeight(scanner));
                animal.setColor(ColorInput.getColor(scanner));

                animals.add(animal);

                animal.say();
            }
        } while (currentCommand != Command.EXIT);
    }
}