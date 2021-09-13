package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepositor;

	public List<Topic> getAllTopics() {

		List<Topic> topics = new ArrayList<>();
		topicRepositor.findAll().forEach(topics::add);
		return topics;

	}

	public Optional<Topic> getTopic(String id) {

		return topicRepositor.findById(id);

	}

	public void addTopic(Topic topic) {

		topicRepositor.save(topic);
	}

	public void updateTopic(Topic topic, String id) {

		topicRepositor.save(topic);

	}

	public void deleteTopic(String id) {

		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic top = topics.get(i); if
		 * (top.getId().equals(id)) { topics.remove(i); } }
		 */

		// topics.removeIf(t -> t.getId().equals(id));
		;
		topicRepositor.deleteById(id);
	}

}
