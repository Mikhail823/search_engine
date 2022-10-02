package com.popov.service.impl;

import com.popov.models.Page;
import com.popov.repo.PageRepository;
import com.popov.service.PageRepositoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PageRepoServiceImplTest {

    private String URL = "http://www.playback.ru";
    @Autowired
    private PageRepository pageRepository;
    @Autowired
    private PageRepositoryService pageRepositoryService;

    @Test
    void getPage() {
        Page page = new Page();
        page.setPath("/error.html");
        page.setSiteId(200);
        page.setContent("<body>jsbfhydsbfhybshdb</body>");
        pageRepository.save(page);
        pageRepository.findByPath("/error.html");

    }

    @Test
    void save() {
        Page page = new Page();
        page.setPath("/content.html");
        page.setCode(200);
        page.setContent("<html></html>");
        pageRepository.save(page);
    }

    @Test
    void findPageById() {
    }

    @Test
    void findPageByPageIdAndSiteId() {
    }

    @Test
    void pageCount() {
    }

    @Test
    void testPageCount() {
    }

    @Test
    void deletePage() {
    }
}