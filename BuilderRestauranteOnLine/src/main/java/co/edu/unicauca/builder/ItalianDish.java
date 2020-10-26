package co.edu.unicauca.builder;

/**
 *
 * @author Camilo Otaya, Maria Teresa Trujillo
 */
public class ItalianDish extends Dish {

    private String italianName;

    /**
     * Constructor parametrizado de la clase ItalianDish
     *
     * @param name
     * @param description
     * @param image
     * @param price
     * @param size
     * @param italianName
     */
    public ItalianDish(String name, String description, String image, int price, EnumSize size, String italianName) {
        super(name, description, image, price, size);
        this.italianName = italianName;
    }

    /**
     * Getters y setters
     *
     * @return
     */
    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

}
