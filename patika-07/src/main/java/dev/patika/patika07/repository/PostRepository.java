package dev.patika.patika07.repository;

import dev.patika.patika07.model.Post;
import dev.patika.patika07.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
