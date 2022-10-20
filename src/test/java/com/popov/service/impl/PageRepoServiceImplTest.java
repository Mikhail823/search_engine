package com.popov.service.impl;

import com.popov.models.Page;
import com.popov.repo.PageRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(properties = "spring.main.lazy-initialization=true")
class PageRepoServiceImplTest {
    @Autowired
    private PageRepository repository;

    private Page p1, p2;
    @BeforeEach
    void setUp(ApplicationContext context) {
        //Создание тестовой страницы
        p1 = new Page();
        p1.setId(1);
        p1.setCode(200);
        p1.setPath("/ru.html");
        p1.setContent("<html><title>Hellow Word!!</title></html>");

        p2 = new Page();
        p2.setId(2);
        p2.setCode(200);
        p2.setPath("/rukk.html");
        p2.setContent("<html><title>Hellow Word!! Russia and Word!!</title></html>");

        repository.saveAll(List.of(p1, p2));
    }

    @AfterEach
    void tearDown() {
        repository.deleteAll();
    }


    @Test
    void getPage() {
        repository.findByPath("/rukk.html");
    }

    @Test
    void save() {
        Page page = new Page();
        page.setId(1);
        page.setPath("/trt.html");
        page.setCode(200);
        page.setContent("<html><title>Food</title></html>");
        repository.save(page);

    }

    @Test
    void findPageById() {
        repository.findById(1);

    }

    @Test
    void deletePage() {
        repository.delete(p1);
    }

    @Test
    void testFindAll(){
       repository.findAll();
    }
}