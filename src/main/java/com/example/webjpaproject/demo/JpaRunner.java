package com.example.webjpaproject.demo;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        postRepository.findAll().forEach(System.out::println);

        Post post = new Post();

        post.setTitle("Start");

        postRepository.findAllByTitleLike(post.getTitle()).forEach(System.out::println);




//        Account account = new Account();
//
//        account.setUsername("jhheo");
//        account.setPassword("Test1");
//
//        Study study = new Study();
//        study.setName("Spring Data JPA");


//        account.addStudy(study);

//        account.getStudies().add(study);
//        study.setOwner(account);

//        Post post = new Post();
//        post.setTitle("Start Post");
//
//        Comment comment = new Comment();
//        comment.setComment("Comment and Post");
//        post.addCommnet(comment);
//
//        Comment comment1 = new Comment();
//        comment1.setComment("Comment And Comment");
//        post.addCommnet(comment1);


//        Session session = entityManager.unwrap(Session.class);


//        Query query = entityManager.createQuery("SELECT p from Post as p", Post.class);
//        List<Post> posts= query.getResultList();

//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Post> query = builder.createQuery(Post.class);
//        Root<Post> root = query.from(Post.class);
//        query.select(root);
//
//        List<Post> posts = entityManager.createQuery(query).getResultList();
//
//        posts.forEach(System.out::println);

//        posts.forEach(System.out::println);



//        Post post = session.get(Post.class, 1l);
//
//        System.out.println("=======================");
//        System.out.println(post.getTitle());
//
//        Comment comment = session.get(Comment.class, 1l);
//        System.out.println("=========================");
//        post.getComments().forEach( c ->{
//            System.out.println(c.getComment());
//        });

//        session.save(post);

//        session.save(account);
//        session.save(study);

//        Account jhheo = session.load(Account.class, account.getId());






    }

}
