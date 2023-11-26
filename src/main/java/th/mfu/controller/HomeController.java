package th.mfu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import th.mfu.model.UsersModel;

public class HomeController {
    @GetMapping("/gg")
    public String homePage(Model model) {
        // โค้ดสำหรับการจัดเตรียมข้อมูลที่ต้องการส่งไปยังหน้า HTML
        return "index"; // ชื่อไฟล์ HTML ที่ต้องการส่งกลับ
    }

}
