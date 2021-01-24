package com.hasanli.service.inter;

import com.hasanli.entity.Contents;

import java.util.List;

public interface ContentsServiceInter {
    public List<Contents> getAllContents();
    public List<Contents> getAllContentsByCategory(String categoryName);
    public boolean updateContent(Contents content);
    public boolean addContent(Contents content);
    public int deleteContent(Integer id);
    public List<Contents> findContent(String header);
}
