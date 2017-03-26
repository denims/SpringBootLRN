package com.deni.test.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	@Autowired
	private TopicsService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> topics() {
		return topicService.getAllTopics();

	}
	

}
