package com.deni.test.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	private List<Topic> topics = Arrays.asList(new Topic("spring", "Spring tutorial", "Spring Class"),
			new Topic("java", "java tutorial", "java Class"));

	public List<Topic> getAllTopics() {
		return topics;
	}

}
