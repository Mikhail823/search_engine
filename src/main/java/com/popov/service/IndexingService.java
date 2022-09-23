package com.popov.service;


import com.popov.service.responses.ResponseService;

public interface IndexingService {
    ResponseService startIndexingAll();
    ResponseService stopIndexing();
    ResponseService startIndexingOne(String url);
}
