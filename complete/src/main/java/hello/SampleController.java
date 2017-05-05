package hello;

/**
 * Created by Bijon on 5/4/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String index(Model model) {
        Gizmo gizmo = new Gizmo();
        GizmoChild gizmoChild = new GizmoChild();
        gizmoChild.setChildField1("bejon");
        GrandChild grandChild = new GrandChild();
        grandChild.setaBoolean(Boolean.TRUE);
        GrandChild grandChild1 = new GrandChild();
        grandChild1.setaBoolean(Boolean.FALSE);
        grandChild1.setValue("bejon's grandchild");
        List<GrandChild> grandChildren = new ArrayList<>();
        grandChildren.add(grandChild);
        grandChildren.add(grandChild1);
        gizmoChild.setGrandChildren(grandChildren);
        gizmo.getChildren().add(gizmoChild);
        gizmo.getChildren().add(new GizmoChild());
        model.addAttribute("gizmo", gizmo);
        return "hello";
    }

    @RequestMapping("/save")
    public String save(Gizmo gizmo) {
        System.out.println(gizmo.getField1());
        System.out.println(gizmo.getField2());
        for(GizmoChild child : gizmo.getChildren()) {
            System.out.println("child one: "+child.getChildField1());
            System.out.println("child two: "+child.getChildField2());
            System.out.println("boolean"+child.getIsSelected());
            for(GrandChild grandChild: child.getGrandChildren()){
                System.out.println("grandChild Boolean: "+grandChild);
            }
        }
        return "redirect:/";
    }
}
