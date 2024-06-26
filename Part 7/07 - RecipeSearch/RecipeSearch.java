import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipesRegister register = new RecipesRegister();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            System.out.println("Commands: ");
            System.out.println("list - lists the recipes\n" +
                    "stop - stops the program\n" +
                    "find name - searches recipes by name\n" +
                    "find cooking time - searches recipes by cooking time\n" +
                    "find ingredient - searches recipes by ingredient");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            while (fileScan.hasNextLine()) {
                
                String name = fileScan.nextLine();
                int cookingTime = Integer.valueOf(fileScan.nextLine());
                ArrayList<String> ingredientList = new ArrayList<>();

                String ingredient = fileScan.nextLine();
                while (fileScan.hasNextLine()) {
                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredientList.add(ingredient);
                    ingredient = fileScan.nextLine();
                }

                Recipe recipe = new Recipe(name, ingredientList, cookingTime);
                register.add(recipe);
            }

            if (command.equals("list")) {
                register.print();
            } else if (command.equals("stop")) {
                return;
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                register.find(search);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                register.searchCookingTimes(maxTime);
            } else if (command.equals(("find ingredient"))) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                register.searchIngredients(ingredient);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}