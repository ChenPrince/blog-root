package com.zerodg.serviceImpl.service;

import com.zerodg.vwentity.dto.SY.SY01ArticleDTO;
import com.zerodg.vwentity.dto.SY.SY01SlideshowDTO;
import com.zerodg.vwentity.dto.SY.SY01SortDTO;
import com.zerodg.vwentity.entity.Article;

import java.util.List;

/**
 * create by Administrator on 13:10 2019/6/25 0025
 */
public interface SY01Service {

    SY01SlideshowDTO getCarouselList();

    SY01ArticleDTO getArticleList();

    SY01SortDTO getSortList();

    List<Article> SelectArticleSortByStar();

    List<Article> SelectArticleSortByTime();

    List<Article> selectBySort(String sort);
}
