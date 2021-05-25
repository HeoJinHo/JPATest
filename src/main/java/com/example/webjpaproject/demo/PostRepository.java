package com.example.webjpaproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

//@Repository
//@Transactional

public interface PostRepository extends JpaRepository<Post, Long>
{
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public Post add(Post post)
//    {
//        entityManager.persist(post);
//        return post;
//    }
//
//    public void delete(Post post)
//    {
//        entityManager.remove(post);
//    }
//
//    public List<Post> findAll()
//    {
//        return entityManager.createQuery("select p from Post AS p", Post.class)
//                .getResultList();
//    }

}
