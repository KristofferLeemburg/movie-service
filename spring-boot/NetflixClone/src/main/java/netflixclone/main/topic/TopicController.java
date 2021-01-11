package NetflixClone.Main.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

// automatically returns the following as JSON
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    //{id} shows that this is a variable portion
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    //POST request
    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    //PUT request
    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    //DELETE request
    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    //the method name (deleteTopic, addTopic, etc) is of your own choosing!
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
