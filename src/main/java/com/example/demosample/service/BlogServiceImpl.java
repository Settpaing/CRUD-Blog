package com.example.demosample.service;

import com.example.demosample.domain.Blog;
import com.example.demosample.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{

    private final BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Blog create(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.getOne(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
