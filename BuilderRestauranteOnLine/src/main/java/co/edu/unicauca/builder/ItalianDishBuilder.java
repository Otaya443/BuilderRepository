package co.edu.unicauca.builder;

/**
 *
 * @author Camilo Otaya, Maria Teresa Trujillo
 */
public class ItalianDishBuilder extends DishBuilder {
    
    @Override
    public void setCore() {
        this.setDish(new ItalianDish("pizza", "Pizza con estilo Europeo, añadiendo ingredientes con ingredientes como masa, los champiñones, queso y salsas", "", 36000, EnumSize.ALL, "Italian Pizza"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Verduras asadas", "verduras asadas como entrada", "", 5000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Vino", "Vino Italiano", "", 40000, EnumSize.HALF));

    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }
    
}
