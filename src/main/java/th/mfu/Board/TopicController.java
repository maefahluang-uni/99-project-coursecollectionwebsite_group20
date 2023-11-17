package th.mfu.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TopicController {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicController(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @GetMapping("/topicpage") // 1
    public String listTopic(Model model) {
        model.addAttribute("topics", topicRepository.findAll());
        return "topic/list"; // << html page
    }

    @GetMapping("/topic/new")
    public String showTopic(Model model) {
        model.addAttribute("topic", new Topic());
        return "topic/form";// << html page
    }

    @PostMapping("/topic/new") // 2
    public String addTopic(Topic topic) {
        topicRepository.save(topic);
        return "redirect:/topicpage";
    }

}
