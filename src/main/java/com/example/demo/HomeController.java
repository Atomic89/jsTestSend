package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model)
    {
        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);
        System.out.println("work or die mraz Get");
      // ModelAndView mdl = new ModelAndView("home");
     //  mdl.setView("index");
       return "/home";
    }
    @RequestMapping(value = "/home", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse saveAuto(@RequestBody AutoInfo autoInfo)
    {
        String igm = autoInfo.getNumber() + autoInfo.getMark() + autoInfo.getYear() +autoInfo.getNameOrg() ;
        System.out.println(igm);
        System.out.println("work or die mraz POST");


      return new JsonResponse("OK", "");
        //return Response.SC_OK;
    }
    @RequestMapping(value = "/igm", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody AutoInfo autoInfo) {
        autoInfo.setYear("322");
        String igm = autoInfo.getYear();

        // TODO: call persistence layer to update
        return igm;
    }
//    public String homePOST(@RequestBody AutoInfo autoInfo)
//    {
//        AutoInfo auto = new AutoInfo();
//
//       // String message = "Hello Spring Boot + JSP";
//
//       // model.addAttribute("message", message);
//        // ModelAndView mdl = new ModelAndView("home");
//        //  mdl.setView("index");
//        return "/home";
//    }
}
