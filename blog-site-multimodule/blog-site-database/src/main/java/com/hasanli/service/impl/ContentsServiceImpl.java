package com.hasanli.service.impl;

import com.hasanli.dao.inter.ContentsRepository;
import com.hasanli.entity.Contents;
import com.hasanli.service.inter.ContentsServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentsServiceImpl implements ContentsServiceInter {
    @Autowired
    ContentsRepository contentsRepository;
    @Override
    public List<Contents> getAllContents() {
        List<Contents> contents=contentsRepository.findAll();
        return contents;
    }

    @Override
    public List<Contents> getAllContentsByCategory(String categoryName) {
       List<Contents> allContents=contentsRepository.findAll();
       List<Contents> contentsByCategory= new ArrayList<>();
       for(Contents content:allContents){
        if(content.getCategoriesByContentCategory().getName().equalsIgnoreCase(categoryName)){
            contentsByCategory.add(content);
        }
       }
       return contentsByCategory;
    }

    @Override
    public boolean updateContent(Contents content) {
        try {
            contentsRepository.save(content);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    @Override
    public boolean addContent(Contents content) {
        List<Contents> contents=contentsRepository.findAll();
        for(Contents findedContent:contents){
            if(findedContent.getContentHeader().equals(content.getContentHeader())){
                return false;
            }

        }
        Contents savedContent=contentsRepository.save(content);
        if(savedContent==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int deleteContent(Integer id) {
        contentsRepository.deleteById(id);

        if( contentsRepository.findById(id)==null){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public List<Contents> findContent(String header) {
        List<Contents> contents=contentsRepository.findByContentHeaderContainingIgnoreCase(header);
        return contents;
    }
}
