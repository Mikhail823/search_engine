package com.popov.sitemap;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ParseUrlTest {
    private String url = "src/main/resources/templates/test_page.html";

    @Test
    void computeTestInterrupted() {
        ParseUrl parseUrl = new ParseUrl("https://www.playback.ru", true);
        assertEquals("", parseUrl.compute());
    }

    @Test
    void compute() throws IOException, InterruptedException {
        Document document = Jsoup.parse(url);
    }

    @Test
    void getDocumentByUrl() {
    }
}