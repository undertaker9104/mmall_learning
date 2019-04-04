package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by under on 2019/3/20.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
