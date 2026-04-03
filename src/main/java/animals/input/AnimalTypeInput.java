package animals.input;

import animals.AnimalType;

import java.util.Scanner;

public class AnimalTypeInput {

    public static AnimalType getAnimalType(Scanner scanner){
        String animalTypeInput = null;

        while (AnimalType.doesNotAnimalType(animalTypeInput)){
            if (animalTypeInput != null) {
                System.out.println("Введен неверный тип животного, попробуйте еще раз");
            }
            System.out.printf("Введите одно из животных (%s): ",
                    String.join("/",AnimalType.VALUES));
            animalTypeInput = scanner.next();
        }
        return AnimalType.fromStringAnimalType(animalTypeInput);
    }
}
