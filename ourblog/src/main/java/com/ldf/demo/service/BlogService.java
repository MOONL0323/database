package com.ldf.demo.service;

import com.ldf.demo.pojo.Blog;
import com.ldf.demo.vo.*;

import java.util.List;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
public interface BlogService {

    List<BlogQuery> listBlogs();

    int saveBlog(Blog blog);

    ShowBlog getBlogById(Long id);

    int updateBlog(ShowBlog showBlog);

    int deleteBlogById(Long id);

    List<SearchBlog> searchBlogs(SearchBlog searchBlog);

    List<FirstPageBlog> getFirstPageBlogs();

    List<RecommendBlog> recommendedBlogs();

    List<FirstPageBlog> getSearchBlogs(String query);

    DetailedBlog getDetailedBlogById(Long id);

    Integer getBlogTotal();

    Integer getBlogViewTotal();

    Integer getBlogCommentTotal();

    Integer getBlogMessageTotal();

    List<FirstPageBlog> getBlogsByTypeId(Long id);

    List<ArchiveBlog> getArchiveBlogs();

}
