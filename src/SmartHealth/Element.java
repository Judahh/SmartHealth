/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartHealth;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Judah
 */
public class Element {
    private String name;
    private BigDecimal total;
    private List<Element> list;
    private boolean unknown;

    public Element(String name) {
        this.name = name;
        this.unknown = true;
    }
    
    public Element(String name, BigDecimal total) {
        this.name = name;
        this.total = total;
        this.unknown = false;
    }
    
    public Element(String name, BigDecimal total, List list) {
        this.name = name;
        this.total = total;
        this.list = list;
        this.unknown = false;
    }
    
    public boolean getUnknown() {
        return unknown;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        if(this.unknown){
            return new BigDecimal(-1);
        }
        return total;
    }
    
    public List getList() {
        return list;
    }

    public void setUnknown(boolean unknown) {
        this.unknown = unknown;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
        this.unknown = false;
    }
    
    public void setList(List list) {
        this.list = list;
    }

    public BigDecimal getTotal() {
        BigDecimal sum=sum();
        if(sum.compareTo(total)>0){
            return sum;
        }
        return total;
    }
    
    private BigDecimal sum(){
        BigDecimal sum = new BigDecimal(0);
        list.stream().filter((list1) -> (list1.getAmount().compareTo(new BigDecimal(-1)) != 0)).forEach((list1) -> {
            sum.add(list1.getAmount());
        });
        return sum;
    }
}
