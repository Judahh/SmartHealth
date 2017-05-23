/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartHealth;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Judah
 */
public class BasicNutritionFacts {
    private CholesterolList cholesterol;//g
    private CarbohydrateList carbohydrateList;
    private ProteinList proteinList;
    private FatList fatList;
    private MineralList mineralList;
    private VitaminList vitaminList;
    private FiberList fiberList;

    public BasicNutritionFacts() {
        cholesterol= new CholesterolList(BigDecimal.ZERO, null);
        carbohydrateList = new CarbohydrateList(BigDecimal.ZERO, null);
        proteinList = new ProteinList(BigDecimal.ZERO, null);
        ArrayList<Element> arrayListFat = new ArrayList<>();
        Element elementSaturated = new Element("Saturated");
        Element elementInsaturated = new Element("Insaturated");
        
        Element elementInsaturatedMono = new Element("Mono");
        Element elementInsaturatedPoli = new Element("Poli");
        
        Element elementInsaturatedPoliOmega3 = new Element("Omega 3");
        
        Element elementInsaturatedPoliOmega3DHA = new Element("Docosahexaenoic Acid");
        Element elementInsaturatedPoliOmega3EPA = new Element("Eicosapentaenoic Acid");
        
        Element elementInsaturatedTrans = new Element("Trans");
        
        elementInsaturatedPoliOmega3.getList().add(elementInsaturatedPoliOmega3DHA);
        elementInsaturatedPoliOmega3.getList().add(elementInsaturatedPoliOmega3EPA);
        
        elementInsaturatedPoli.getList().add(elementInsaturatedPoliOmega3);
        
        elementInsaturated.getList().add(elementInsaturatedMono);
        elementInsaturated.getList().add(elementInsaturatedPoli);
        elementInsaturated.getList().add(elementInsaturatedTrans);
        
        arrayListFat.add(elementSaturated);
        arrayListFat.add(elementInsaturated);
        
        fatList = new FatList(BigDecimal.ZERO, arrayListFat);
        
        ArrayList<Element> arrayListMineral = new ArrayList<>();
        
        Element elementCalcium = new Element("Calcium");
        Element elementSodium = new Element("Sodium");
        Element elementIron = new Element("Iron");
        Element elementZinc = new Element("Zinc");
        
        arrayListMineral.add(elementSodium);
        arrayListMineral.add(elementCalcium);
        arrayListMineral.add(elementZinc);
        arrayListMineral.add(elementIron);
        
        mineralList = new MineralList(BigDecimal.ZERO, arrayListMineral);
        
        ArrayList<Element> arrayListVitamin = new ArrayList<>();
        
        Element elementVitaminA = new Element("A");
        
        Element elementVitaminA1 = new Element("Carotenoid");
        Element elementVitaminA2 = new Element("Retinoid");
        
        elementVitaminA.getList().add(elementVitaminA1);
        elementVitaminA.getList().add(elementVitaminA2);
        arrayListVitamin.add(elementVitaminA);
        
        Element elementVitaminB = new Element("B");
        
        Element elementVitaminB1 = new Element("Thiamine");
        Element elementVitaminB2 = new Element("Riboflavin");
        Element elementVitaminB3 = new Element("Nicotinic Acid");
        Element elementVitaminB5 = new Element("Pantothenic Acid");
        Element elementVitaminB6 = new Element("Pyridoxamine");
        Element elementVitaminB7 = new Element("Biotin");
        Element elementVitaminB9 = new Element("Folic Acid");
        Element elementVitaminB12 = new Element("Cobalamin");
        
        elementVitaminB.getList().add(elementVitaminB1);
        elementVitaminB.getList().add(elementVitaminB2);
        elementVitaminB.getList().add(elementVitaminB3);
        elementVitaminB.getList().add(elementVitaminB5);
        elementVitaminB.getList().add(elementVitaminB6);
        elementVitaminB.getList().add(elementVitaminB7);
        elementVitaminB.getList().add(elementVitaminB9);
        elementVitaminB.getList().add(elementVitaminB12);
        arrayListVitamin.add(elementVitaminB);
        
        Element elementVitaminC = new Element("C");
        Element elementVitaminC1 = new Element("L-Ascorbic Acid");
        
        elementVitaminC.getList().add(elementVitaminC1);
        arrayListVitamin.add(elementVitaminC);
        
        Element elementVitaminD = new Element("D");
        Element elementVitaminD1 = new Element("Ergocalciferol with Lumisterol");
        Element elementVitaminD2 = new Element("Ergocalciferol");
        Element elementVitaminD3 = new Element("Cholecalciferol");
        Element elementVitaminD4 = new Element("22-Dihydroergocalciferol");
        Element elementVitaminD5 = new Element("Sitocalciferol");
        
        elementVitaminD.getList().add(elementVitaminD1);
        elementVitaminD.getList().add(elementVitaminD2);
        elementVitaminD.getList().add(elementVitaminD3);
        elementVitaminD.getList().add(elementVitaminD4);
        elementVitaminD.getList().add(elementVitaminD5);
        arrayListVitamin.add(elementVitaminD);
        
        Element elementVitaminE = new Element("E");
        Element elementVitaminE1 = new Element("Tocopherol");
        Element elementVitaminE2 = new Element("Tocotrienol");
        
        elementVitaminE.getList().add(elementVitaminE1);
        elementVitaminE.getList().add(elementVitaminE2);
        arrayListVitamin.add(elementVitaminE);
        
        Element elementVitaminK = new Element("K");
        Element elementVitaminK1 = new Element("Phylloquinone");
        Element elementVitaminK2 = new Element("Menaquinone");
        Element elementVitaminK3 = new Element("Menadione");
        Element elementVitaminK4 = new Element("K4");
        Element elementVitaminK5 = new Element("K5");
        
        elementVitaminK.getList().add(elementVitaminK1);
        elementVitaminK.getList().add(elementVitaminK2);
        elementVitaminK.getList().add(elementVitaminK3);
        elementVitaminK.getList().add(elementVitaminK4);
        elementVitaminK.getList().add(elementVitaminK5);
        arrayListVitamin.add(elementVitaminK);
        
        vitaminList = new VitaminList(BigDecimal.ZERO, arrayListVitamin);
        
        fiberList = new FiberList(BigDecimal.ZERO, null);
    }

    public CholesterolList getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(CholesterolList cholesterol) {
        this.cholesterol = cholesterol;
    }

    public CarbohydrateList getCarbohydrateList() {
        return carbohydrateList;
    }

    public void setCarbohydrateList(CarbohydrateList carbohydrateList) {
        this.carbohydrateList = carbohydrateList;
    }

    public ProteinList getProteinList() {
        return proteinList;
    }

    public void setProteinList(ProteinList proteinList) {
        this.proteinList = proteinList;
    }

    public FatList getFatList() {
        return fatList;
    }

    public void setFatList(FatList fatList) {
        this.fatList = fatList;
    }

    public MineralList getMineralList() {
        return mineralList;
    }

    public void setMineralList(MineralList mineralList) {
        this.mineralList = mineralList;
    }

    public VitaminList getVitaminList() {
        return vitaminList;
    }

    public void setVitaminList(VitaminList vitaminList) {
        this.vitaminList = vitaminList;
    }

    public FiberList getFiberList() {
        return fiberList;
    }

    public void setFiberList(FiberList fiberList) {
        this.fiberList = fiberList;
    }
    
    
}
