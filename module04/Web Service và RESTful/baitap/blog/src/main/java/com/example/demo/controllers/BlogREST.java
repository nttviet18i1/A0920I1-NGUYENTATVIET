package com.example.demo.controllers;

import com.example.demo.model.Blog;
import com.example.demo.service.IBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogREST {
    @Autowired
    IBlog iBlog;
    /*get restful*/

    @RequestMapping(value = "/blog/", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> listBlog() {
        List<Blog> blog = iBlog.findAllBlog();
        if (blog.isEmpty()) {
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<Blog>>(blog, HttpStatus.OK);
        }
    }
    /*create Restful*/

    @RequestMapping(value = "/blog/", method = RequestMethod.POST)
    public ResponseEntity<Blog> createtBlog(@RequestBody Blog blog) {

        iBlog.save(blog);
        return new ResponseEntity<Blog>(HttpStatus.CREATED);

    }
    /* DELETE RestFul*/

    @RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Blog> Delete(@PathVariable ("id")int id, Blog blog) {
        iBlog.findById(id);
        if (blog == null) {
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        } else {
            iBlog.delete(id);
            return new ResponseEntity<Blog>( blog, HttpStatus.NO_CONTENT);
        }

    }

    /*update*/
    @RequestMapping(value = "/blog/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Blog> updateCustomer(@PathVariable int id, @RequestBody Blog blog) {

        iBlog.findById(id);
        if (blog == null) {
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        } else {
            iBlog.save(blog);
            blog.setType(blog.getType());
            blog.setAuthor(blog.getAuthor());
            blog.setDescription(blog.getDescription());

            return new ResponseEntity<Blog>( blog, HttpStatus.OK);
        }


    }
}
