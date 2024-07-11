package com.example.idollbom.service.applyservice;

import com.example.idollbom.domain.dto.applydto.ClassListDTO;
import com.example.idollbom.mapper.applymapper.ClassListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassListServiceImpl implements ClassListService {
    private final ClassListMapper classListMapper;

    @Override
    public List<ClassListDTO> findAllClass(String category, int pageNo, int pageSize) {
        return classListMapper.findAllClass(category, pageNo, pageSize);
    }

    @Override
    public int classCount(String category) {
        return classListMapper.classCount(category);
    }

    @Override
    public List<ClassListDTO> searchClassList(String searchWord, String searchType, String category, int pageNo, int pageSize) {
        return classListMapper.searchClassList(searchWord, searchType, category, pageNo, pageSize);
    }

    @Override
    public int countClasses(String category, String searchType, String searchWord) {
        return classListMapper.countClasses(category, searchType, searchWord);
    }
}
