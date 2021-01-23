package com.hasanli.service.impl;

import com.hasanli.entity.Contents;

import java.util.List;

public interface ContentsServiceInter {
    public List<Contents> getAllContents();
    public List<Contents> getAllContentsByCategory();
    public boolean updateContent(Contents content);
    public boolean addContent(Contents content);
    public int deleteContent(Integer id);
    public Contents findContent(String name);
}
