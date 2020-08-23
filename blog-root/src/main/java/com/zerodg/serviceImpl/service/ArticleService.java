package com.zerodg.serviceImpl.service;

import com.zerodg.vwentity.dto.Article.ArticleAuthorDTO;
import com.zerodg.vwentity.dto.Article.ArticleCommentDTO;
import com.zerodg.vwentity.dto.Article.ArticleContentDTO;


/**
 * create by  LZH on 2019/6/25
 */
public interface ArticleService {


    ArticleContentDTO getArticleId(Integer id);

    Integer getUserId(Integer id);

    ArticleCommentDTO getCommentById(Integer id);

    ArticleAuthorDTO getUserById(Integer user_id);

    void insertArticle(Integer userId, String title, String content, String articleType);
}
