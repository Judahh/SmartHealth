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
public abstract class ElementList {
    private BigDecimal total;
    private List<Element> list;

    public ElementList(BigDecimal total, List list) {
        this.total = total;
        this.list = list;
    }
    
    public List getList() {
        return list;
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

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
