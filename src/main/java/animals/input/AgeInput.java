package animals.input;

import java.util.Scanner;

public class AgeInput {
    public static int getAge(Scanner scanner){
        String animalAgeInput;
        int age = 0;
        do {
            System.out.println("Введите возраст животного в годах: ");
            animalAgeInput = scanner.next();
            if (animals.utils.NumberUtils.isNotNumber(animalAgeInput)){
                System.out.println("Возраст животного должен быть указан числом!");
            } else {
                age = Integer.parseInt(animalAgeInput);
                if (age == 0){
                    System.out.println("Возраст животного должен быть больше 0!");
                }
            }
        } while (animals.utils.NumberUtils.isNotNumber(animalAgeInput) || age == 0);
        return Integer.parseInt(animalAgeInput);
    }
}
