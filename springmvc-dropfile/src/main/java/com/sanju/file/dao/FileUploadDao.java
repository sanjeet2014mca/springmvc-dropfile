package com.sanju.file.dao;

import java.util.List;

import com.sanju.file.model.UploadedFile;

public interface FileUploadDao {

  List<UploadedFile> listFiles();

  UploadedFile getFile(Long id);

  UploadedFile saveFile(UploadedFile uploadedFile);

}
