package com.example.sping_portfolio.controllers.navodit.LightSequence;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LightSequenceController {
    @GetMapping("navodit/frq1")
    public String frq1(
            @RequestParam(name = "sequence", required = false, defaultValue = "0") String seq,
            @RequestParam(name = "insert", required = false, defaultValue = "0") String insert,
            @RequestParam(name = "index", required = false, defaultValue = "0") int index,
            @RequestParam(name = "update", required = false, defaultValue = "0") String update,
            @RequestParam(name = "delete", required = false, defaultValue = "0") String delete,
            @RequestParam(name = "a", required = false, defaultValue = "0") double a,
            @RequestParam(name = "b", required = false, defaultValue = "0") double b,
            Model model){
        LightSequence f = new LightSequence(seq);
        String seq1 = f.insertSegment(insert,index);
        String updated = f.updateSequence(update);
        String deleted = f.deleteSequence(delete);
        Double hyp = f.triangle(a,b);
        model.addAttribute("f",f);
        model.addAttribute("seq1", seq1);
        model.addAttribute("updated", updated);
        model.addAttribute("deleted", deleted);
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("hyp",hyp);

        return "navodit/frq1";
    }

}
