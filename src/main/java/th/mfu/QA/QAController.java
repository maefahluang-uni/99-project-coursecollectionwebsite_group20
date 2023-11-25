package th.mfu.QA;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import th.mfu.QA.Repo.CommentRepository;
import th.mfu.QA.Repo.TitleRepository;
import th.mfu.QA.model.Comment;
import th.mfu.QA.model.TitleEntity;

@Controller
public class QAController {
    @Autowired
    CommentRepository commentRepo; // seat

    @Autowired
    TitleRepository titleRepo; // concerts

    @GetMapping("/title")
    public String listTitle(Model model) {
        model.addAttribute("title", titleRepo.findAll());
        return "list-title";
    }

    @GetMapping("/add-title")
    public String addTitleForm(Model model) {
        model.addAttribute("title", new TitleEntity());
        return "add-title-form";
    }

    @PostMapping("/title")
    public String saveTitle(@ModelAttribute TitleEntity titleEntity) {
        titleRepo.save(titleEntity);// titleRepo.save(titleEntity);
        return "redirect:/title";
    }

    // ลบตัว title
    @Transactional
    @GetMapping("/delete-title/{id}")
    public String deleteTitle(@PathVariable long id) {
        commentRepo.deleteByTitleEntityId(id);
        titleRepo.deleteById(id);
        return "redirect:/title";
    }

    @GetMapping("/title/{id}/comments")
    public String showAddCommentForm(Model model, @PathVariable long id) {
        model.addAttribute("comments", commentRepo.findByTitleEntityId(null));
        TitleEntity titleEntity = titleRepo.findById(id).get();
        Comment comment = new Comment();
        comment.setTitleEntity(titleEntity);
        model.addAttribute("newcomment", comment);
        return "comment-mgmt";
    }
  
    @PostMapping("/title/{id}/comments")
    public String saveComment(@ModelAttribute Comment newcomment, @PathVariable Long id) {
           TitleEntity titleEntity = titleRepo.findById(id).get();
        newcomment.setTitleEntity(titleEntity);
        commentRepo.save(newcomment);
        return "comment-mgmt";
    }
}
