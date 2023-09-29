package com.blog.utils;


import com.blog.model.Post;
import com.blog.repository.BlogRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    BlogRepository blogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Danilo Massoni");
        post1.setData(LocalDate.now());
        post1.setTitulo("Microbit");
        post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut sit amet ante nec quam condimentum blandit et sed sem. Donec eu leo euismod, tincidunt nunc a, tincidunt tellus. Nulla tristique quis est ut pellentesque. Morbi quis tellus non nunc facilisis vulputate. Aenean lobortis congue velit et blandit. Sed dapibus hendrerit lectus, ut condimentum mi luctus non. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisi. Nam dignissim ipsum a nibh egestas fermentum. Ut pharetra vehicula rutrum. Vivamus velit elit, vestibulum eu neque sit amet, fringilla pulvinar est. Cras at ligula ut erat facilisis ultrices et nec nulla. Fusce finibus ante a rutrum dictum.");


        Post post2 = new Post();
        post2.setAutor("Danilo Massoni");
        post2.setData(LocalDate.now());
        post2.setTitulo("Arduino");
        post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut sit amet ante nec quam condimentum blandit et sed sem. Donec eu leo euismod, tincidunt nunc a, tincidunt tellus. Nulla tristique quis est ut pellentesque. Morbi quis tellus non nunc facilisis vulputate. Aenean lobortis congue velit et blandit. Sed dapibus hendrerit lectus, ut condimentum mi luctus non. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisi. Nam dignissim ipsum a nibh egestas fermentum. Ut pharetra vehicula rutrum. Vivamus velit elit, vestibulum eu neque sit amet, fringilla pulvinar est. Cras at ligula ut erat facilisis ultrices et nec nulla. Fusce finibus ante a rutrum dictum.");


        postList.add(post1);
        postList.add(post2);

        for (Post post: postList){
            Post postSaved = blogRepository.save(post);
            System.out.println(postSaved.getId());
        }


















    }
}
