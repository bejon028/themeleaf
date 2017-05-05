package hello;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bijon on 5/4/2017.
 */
public class GizmoChild {
    private Long id;
    private String childField1;
    private String childField2;
    private Boolean isSelected;
    private List<GrandChild> grandChildren;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<GrandChild> getGrandChildren() {
        if(grandChildren == null){
            grandChildren = new ArrayList<GrandChild>();
        }
        return grandChildren;
    }

    public void setGrandChildren(List<GrandChild> grandChildren) {
        this.grandChildren = grandChildren;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public String getChildField1() {
        return childField1;
    }

    public void setChildField1(String childField1) {
        this.childField1 = childField1;
    }

    public String getChildField2() {
        return childField2;
    }

    public void setChildField2(String childField2) {
        this.childField2 = childField2;
    }
}
