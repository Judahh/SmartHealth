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
public class NutritionFacts {//for 1kg
    private BigDecimal energyValue;//kcal;
    private CholesterolList cholesterolList;//g
    private CarbohydrateList carbohydrateList;
    private ProteinList proteinList;
    private FatList fatList;
    private MineralList mineralList;
    private VitaminList vitaminList;
    private FiberList fiberList;//g

    public NutritionFacts(BigDecimal energyValue, CholesterolList cholesterolList, CarbohydrateList carbohydrateList, ProteinList proteinList, FatList fatList, MineralList mineralList, VitaminList vitaminList, FiberList fiberList) {
        this.energyValue = energyValue;
        this.cholesterolList = cholesterolList;
        this.carbohydrateList = carbohydrateList;
        this.proteinList = proteinList;
        this.fatList = fatList;
        this.mineralList = mineralList;
        this.vitaminList = vitaminList;
        this.fiberList = fiberList;
    }
    
    public CholesterolList getCholesterolList() {
        return cholesterolList;
    }

    public VitaminList getVitaminList() {
        return vitaminList;
    }

    public CarbohydrateList getCarbohydrateList() {
        return carbohydrateList;
    }

    public FatList getFatList() {
        return fatList;
    }

    public FiberList getFiberList() {
        return fiberList;
    }

    public BigDecimal getEnergyValue() {
        return energyValue;
    }

    public MineralList getMineralList() {
        return mineralList;
    }

    public ProteinList getProteinList() {
        return proteinList;
    }

    public void setCholesterolList(CholesterolList cholesterolList) {
        this.cholesterolList = cholesterolList;
    }
    
    public void setCarbohydrateList(CarbohydrateList carbohydrateList) {
        this.carbohydrateList = carbohydrateList;
    }

    public void setFatList(FatList fatList) {
        this.fatList = fatList;
    }

    public void setFiberList(FiberList fiberList) {
        this.fiberList = fiberList;
    }

    public void setEnergyValue(BigDecimal energyValue) {
        this.energyValue = energyValue;
    }

    public void setMineralList(MineralList mineralList) {
        this.mineralList = mineralList;
    }
    
    public void setVitaminList(VitaminList vitaminList) {
        this.vitaminList = vitaminList;
    }

    public void setProteinList(ProteinList proteinList) {
        this.proteinList = proteinList;
    }
}
