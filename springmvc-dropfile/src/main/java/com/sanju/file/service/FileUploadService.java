package com.sanju.file.service;

import java.util.List;

import com.sanju.file.model.UploadedFile;

public interface FileUploadService {

  List<UploadedFile> listFiles();

  UploadedFile getFile(Long id);

  UploadedFile saveFile(UploadedFile uploadedFile);

}
