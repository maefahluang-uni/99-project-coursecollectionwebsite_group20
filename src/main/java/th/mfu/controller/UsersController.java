package th.mfu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import th.mfu.model.UsersModel;
import th.mfu.service.UsersService;

@Controller
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("registerRequest", new UsersModel());
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "login_page";
    }
       @GetMapping("/uxui")
    public String Showuxui(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "uxui";
    }
    // =====================================================
      @GetMapping("/js")
    public String Showjs(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/js/java s";
    }
     @GetMapping("/jsb")
    public String Showjsb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/js/java s int";
    }
     @GetMapping("/jsi")
    public String Showjsi(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/js/java s be";
    }
     @GetMapping("/jsa")
    public String Showjsa(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/js/java s ad";
    }
    //===============================
        // =====================================================
      @GetMapping("/http")
    public String Showasd(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/http/HTTP";
    }
     @GetMapping("/httpb")
    public String Showhh(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
         return "/รวม/http/HTTP be";
    }
     @GetMapping("/httpi")
    public String Showhtia(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
         return "/รวม/http/HTTP int";
    }
     @GetMapping("/httpad")
    public String Showhhtpad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/http/HTTP ad";
    }
    //===============================
    // =====================================================
      @GetMapping("/java")
    public String Showjava(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/java/java";
    }
     @GetMapping("/javab")
    public String Showh(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
         return "/รวม/java/java be";
    }
     @GetMapping("/javai")
    public String Showhha(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
         return "/รวม/java/java int";
    }
     @GetMapping("/javaad")
    public String Showjha(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/java/java ad";
    }

    //===============================
      // =====================================================
      @GetMapping("/sql")
    public String Showsql(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/my sql/MY SQL";
    }
     @GetMapping("/sqlb")
    public String Showsqlb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
         return "/รวม/my sql/MY SQL be";
    }
     @GetMapping("/sqli")
    public String Showsqli(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
         return "/รวม/my sql/MY SQL int";
    }
     @GetMapping("/sqlad")
    public String Showsqlad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/my sql/MY SQL ad";
    }
    
    //===============================
     
        // =====================================================
      @GetMapping("/py")
    public String Showpy(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/python/";
    }
     @GetMapping("/pyb")
    public String Showpyb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
         return "/รวม/python/Python be";
    }
     @GetMapping("/pyi")
    public String Showpyi(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
         return "/รวม/python/Python int";
    }
     @GetMapping("/pyad")
    public String Showpyad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/python/Python ad";
    }
    
    //===============================
    @PostMapping("/register")
    public String register(@ModelAttribute UsersModel usersModel) {
        System.out.println("register request: " + usersModel);
        UsersModel registerUsers = usersService.registerUser(usersModel.getLogin(), usersModel.getPassword(),
                usersModel.getEmail());
        return registerUsers == null ? "error_page" : "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel, Model model) {
        System.out.println("login request: " + usersModel);
        UsersModel authenticated = usersService.authenticated(usersModel.getLogin(), usersModel.getPassword());
        if (authenticated != null) {
            model.addAttribute("userLogin", authenticated.getLogin());
            return "logout";
        } else {
            return "error_page";
        }
          // =====================================================
      @GetMapping("/c")
    public String Showc(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/C.html";
    }
      @GetMapping("/cad")
    public String Showcad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/C ad.html";
    }
      @GetMapping("/cb")
    public String Showcb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/C be.html";
    }
      @GetMapping("/ci")
    public String Showci(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/C int.html";
    }
    //===============================
          @GetMapping("/c+")
    public String Showc+(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/c++.html";
    }
      @GetMapping("/c+b")
    public String Showc+b(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/c++ be.html";
    }
      @GetMapping("/c+i")
    public String Showc+i(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/c++ int.html";
    }
      @GetMapping("/c+ad")
    public String Showc+ad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/c++ ad.html";
    }
    //===============================
        //===============================
          @GetMapping("/cช")
    public String Showcช(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Cชาบ.html";
    }
      @GetMapping("/cชb")
    public String Showcชb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Cชาบ be.html";
    }
      @GetMapping("/cชi")
    public String Showcชi(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Cชาบ int.html";
    }
      @GetMapping("/cชad")
    public String Showcชad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Cชาบ ad.html";
    }
    //===============================
            //===============================
          @GetMapping("/cs")
    public String Showcs(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Css.html";
    }
          @GetMapping("/csb")
    public String Showcsb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Css be.html";
    }
          @GetMapping("/csi")
    public String Showcsi(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Css int.html";
    }
          @GetMapping("/csad")
    public String Showcsad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Css ad.html";
    }
    //===============================
            //===============================
          @GetMapping("/cช")
    public String Showcช(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Cชาบ.html";
    }
      @GetMapping("/cชb")
    public String Showcชb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Cชาบ be.html";
    }
      @GetMapping("/cชi")
    public String Showcชi(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Cชาบ int.html";
    }
      @GetMapping("/cชad")
    public String Showcชad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Cชาบ ad.html";
    }
    //===============================
            //===============================
          @GetMapping("/data")
    public String Showdata(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Data sci.html";
    }
          @GetMapping("/datab")
    public String Showdatab(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Data sci be.html";
    }
          @GetMapping("/datai")
    public String Showdatai(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Data sci int.html";
    }
          @GetMapping("/dataad")
    public String Showdataad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Data sci ad.html";
    }
    //===============================
                //===============================
          @GetMapping("/html")
    public String Showhtml(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/HTML.html";
    }
          @GetMapping("/htmlb")
    public String Showhtmlb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/HTML be.html";
    }
          @GetMapping("/htmli")
    public String Showhtmli(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/HTML int.html";
    }
          @GetMapping("/htmlad")
    public String Showhtmlad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/HTML ad.html";
    }
    //===============================
    }

}