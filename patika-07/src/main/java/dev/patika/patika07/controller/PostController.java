package dev.patika.patika07.controller;

import dev.patika.patika07.model.Post;
import dev.patika.patika07.model.Todo;
import dev.patika.patika07.repository.PostRepository;
import dev.patika.patika07.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@RestController
public class PostController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    PostRepository postRepository;

    @GetMapping("/get/post/{id}")
    public Post getJsonFromRemoteTodoList(@PathVariable int id) {
        Post post = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/" + id, Post.class);
        post.setLocalDateTime(LocalDateTime.now());
        postRepository.save(post);
        return post;
    }

}
