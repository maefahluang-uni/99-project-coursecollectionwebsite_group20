package th.mfu.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "products/list"; // << html page
    }

    @GetMapping("/products/new")
    public String showProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "products/form";// << html page
    }

    @PostMapping("/products/new")
    public String addProduct(Product product) {
        productRepository.save(product);
        return "redirect:/products";// << html page กลับไปที่ path products ที่ return หน้าListไว้
    }

    // ส่วนนี้เอาไว้แก้ไข
    @GetMapping("/products/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id: " + id));

        model.addAttribute("product", product);
        return "products/editForm";
    }

    @PostMapping("/products/edit/{id}")
    public String editProduct(@PathVariable Long id, @ModelAttribute("product") Product updatedProduct) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id: " + id));

        // ดำเนินการอัพเดตข้อมูล
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        productRepository.save(product);

        return "redirect:/products";
    }

    // ตัวลบข้อมูล
    @GetMapping("/products/delete/{id}")
    public String showDeleteForm(@PathVariable Long id, Model model) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id: " + id));

        model.addAttribute("product", product);
        return "products/deleteForm";
    }

    @PostMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/products";
    }

}
