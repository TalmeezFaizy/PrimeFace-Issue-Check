package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {
    
    private String testString;
	private List<SelectItem> selectList;
    
    @PostConstruct  
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
		selectList.add(new SelectItem("Hello", "hello"));
		selectList.add(new SelectItem("Hi", "hi"));
		selectList.add(new SelectItem("Primefaces", "primefaces"));
		selectList.add(new SelectItem("JSF", "jsf"));
		
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }  

	    public List<SelectItem> getSelectList() {
        return selectList;
    }

    public void setSelectList(List<SelectItem> selectList) {
        this.selectList = selectList;
    }
}
