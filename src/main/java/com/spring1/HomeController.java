package com.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    AlienDao dao;
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @PostMapping("addAlien")
    public String add (@ModelAttribute("result") Alien a)
    {
      dao.addAlien(a);
      return "showAliens.jsp";
    }

    @GetMapping("getAliens")
    @ResponseBody
    public List<Alien> getAliens(Model a){
//       a.addAttribute("result" , dao.getAliens() );
//       return "showAliens.jsp";
        return dao.getAliens();
    }

    @RequestMapping("getAlien/{aid}")
    @ResponseBody
    public Alien getUrlAlien(@PathVariable("aid") int aid){

        return dao.getAlien(aid);
    }
    @RequestMapping("getAlien")
    @ResponseBody
    public Alien getAlien(@ModelAttribute("aid") int aid){

        return dao.getAlien(aid);
    }


    @RequestMapping("Delete")
    public void delete(@RequestParam("aid") int aid)
    {
       // a.addAttribute("alien" , dao.deleteAlien(aid)+"");
        int r  = dao.deleteAlien(aid);
        System.out.println(r);

    }

    @RequestMapping("Update")
    public void update(@RequestParam("aid") int aid , @RequestParam("phn_no") int phone)
    {
        int r  = dao.updateAlien(aid , phone);
        System.out.print(r);
    }

}
