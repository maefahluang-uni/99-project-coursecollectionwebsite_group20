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

    // ===============================
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

    // ===============================
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

    // ===============================
    // =====================================================
    @GetMapping("/sql")
    public String Showsql(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/my sql/My SQL";
    }

    @GetMapping("/sqlb")
    public String Showsqlb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/my sql/My SQL be";
    }

    @GetMapping("/sqli")
    public String Showsqli(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/my sql/My SQL int";
    }

    @GetMapping("/sqlad")
    public String Showsqlad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/my sql/My SQL ad";
    }

    // ===============================

    // =====================================================
    @GetMapping("/py")
    public String Showpy(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/python/Python";
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

    @GetMapping("/c")
    public String ShowCgod(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/C/C";
    }

    @GetMapping("/cad")
    public String Showcad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/C/C ad";
    }

    @GetMapping("/cb")
    public String Showcb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/C/C be";
    }

    @GetMapping("/ci")
    public String Showci(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/C/C int";
    }

    // ===============================
    @GetMapping("/c+")
    public String Showbigc(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/c++/c++";
    }

    @GetMapping("/c+b")
    public String Showcbigccb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/c++/c++ be";
    }

    @GetMapping("/c+i")
    public String Showcbigcci(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/c++/c++ int";
    }

    @GetMapping("/c+ad")
    public String Showcbigccad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/c++/c++ ad";
    }

    // ===============================
    // ===============================
    // ===============================
    @GetMapping("/cs")
    public String ShowcssmallC(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/cs/Css";
    }

    @GetMapping("/csb")
    public String ShowcsmallCsb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/cs/Css be";
    }

    @GetMapping("/csi")
    public String ShowcsmallCsi(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/cs/Css int";
    }

    @GetMapping("/csad")
    public String ShowcsmallCsad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/cs/Css ad";
    }

    // ===============================
    // ===============================
    @GetMapping("/ca")
    public String ShowcsmallCcsa(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Ccarb/Ccarb";
    }

    @GetMapping("/cab")
    public String ShowcsmallCb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Ccarb/Ccarb be";
    }

    @GetMapping("/cai")
    public String ShowcsmallCcsi(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Ccarb/Ccarb int";
    }

    @GetMapping("/caad")
    public String ShowccsmallCasd(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/Ccarb/Ccarb ad";
    }

    // ===============================
    // ===============================
    @GetMapping("/data")
    public String Showdata(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/data sci/Data sci";
    }

    @GetMapping("/datab")
    public String Showdatab(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/data sci/Data sci be";
    }

    @GetMapping("/datai")
    public String Showdatai(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/data sci/Data sci int";
    }

    @GetMapping("/dataad")
    public String Showdataad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/data sci/Data sci ad";
    }
    @GetMapping("/home")
    public String Showlogout(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "logout";
    }

    // ===============================
    // ===============================
    @GetMapping("/html")
    public String Showhtml(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/html/HTML";
    }

    @GetMapping("/htmlb")
    public String Showhtmlb(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/html/HTML be";
    }

    @GetMapping("/htmli")
    public String Showhtmli(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/html/HTML int";
    }

    @GetMapping("/htmlad")
    public String Showhtmlad(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "/รวม/html/HTML ad";
    }

    // ===============================
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

        // ===============================

    }

}