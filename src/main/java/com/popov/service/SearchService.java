package com.popov.service;

import com.popov.models.Request;
import com.popov.service.responses.ResponseService;

import java.io.IOException;

public interface SearchService {
    ResponseService getResponse (Request request, String url, int offset, int limit) throws IOException;
}
