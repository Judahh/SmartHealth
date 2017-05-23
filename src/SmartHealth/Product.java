/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartHealth;

import java.math.BigDecimal;

/**
 *
 * @author Judah
 */
public class Product {
    private String name;
    private String brand;
    private NutritionFacts nutritionFacts;

    public Product(String name, String brand, NutritionFacts nutritionFacts) {
        this.name = name;
        this.brand = brand;
        this.nutritionFacts = nutritionFacts;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }
}
