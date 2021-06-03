package com.example.webjpaproject.demo;


import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
public interface CommentRepositoty {

    Comment save(Comment comment);

    List<Comment> findAll();
}
