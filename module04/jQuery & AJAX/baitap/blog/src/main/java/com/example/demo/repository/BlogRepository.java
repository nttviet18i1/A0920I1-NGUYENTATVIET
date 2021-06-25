package com.example.demo.repository;

import com.example.demo.model.Blog;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog , Integer> {
    List<Blog>findByTypeContaining(String type);
}
