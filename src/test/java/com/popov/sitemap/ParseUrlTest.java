package com.popov.sitemap;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ParseUrlTest {
    private String url = "C:\\Users\\User\\IdeaProjects\\SkilBox_diplom\\search_engine\\src\\main\\resources\\templates\\test_page.html";
    @Test
    void compute() throws IOException, InterruptedException {

        Document document = Jsoup.parse(url);
        String URL = "http://www.playback.ru";

        ParseUrl parseUrl = new ParseUrl(URL, false);
        Mockito.doReturn(document).when(Mockito.mock(ParseUrl.class).getDocumentByUrl(url));

        MatcherAssert.assertThat(parseUrl.compute(), Matchers.containsString("dsfdfafdsf"));
    }

    @Test
    void getDocumentByUrl() {
    }
}