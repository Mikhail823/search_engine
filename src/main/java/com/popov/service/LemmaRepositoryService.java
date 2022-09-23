package com.popov.service;


import com.popov.models.Indexing;
import com.popov.models.Lemma;

import java.util.List;

public interface LemmaRepositoryService {
    List<Lemma> getLemma (String lemmaName);
    void save(Lemma lemma);
    long lemmaCount();
    long lemmaCount(long siteId);
    void deleteAllLemmas(List<Lemma> lemmaList);
    List<Lemma> findLemmasByIndexing(List<Indexing> indexingList);
}
