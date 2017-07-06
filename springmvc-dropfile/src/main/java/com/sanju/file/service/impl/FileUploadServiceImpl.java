package com.sanju.file.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanju.file.dao.FileUploadDao;
import com.sanju.file.model.UploadedFile;
import com.sanju.file.service.FileUploadService;

@Service
public class FileUploadServiceImpl implements FileUploadService {

  @Autowired
  private FileUploadDao dao;

  
  @Transactional(readOnly = true)
  public List<UploadedFile> listFiles() {

    return dao.listFiles();
  }


  
  @Transactional(readOnly = true)
  public UploadedFile getFile(Long id) {
    return dao.getFile(id);
  }

  
  @Transactional
  public UploadedFile saveFile(UploadedFile uploadedFile) {
    return dao.saveFile(uploadedFile);

  }

}
