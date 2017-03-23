package com.deni.test.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	@RequestMapping("/topics")
	public List<Topics> topics() {
		return Arrays.asList(new Topics("spring", "Spring tutorial", "Spring Class"),
				new Topics("java", "Spring tutorial", "Spring Class"));

	}

}
