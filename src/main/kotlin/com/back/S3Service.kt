package com.back

import org.springframework.stereotype.Service
import software.amazon.awssdk.services.s3.S3Client

@Service
interface S3Service{
    fun getBucketNames(): List<String>
}
