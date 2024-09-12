package com.ricka.princy.service;

import com.ricka.princy.file.BucketComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final BucketComponent bucketComponent;

    public void uploadFile(File file){
        //fileContent.toUpperCase()
        bucketComponent.upload(file,"/test");
    }
}
