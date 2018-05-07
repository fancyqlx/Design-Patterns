package fancyqlx.Template;

public class Drink {
    public static void main(String[] args){
        CaffeineBeverage caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
        caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
    }
}
