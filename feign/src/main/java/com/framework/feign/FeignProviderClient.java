package com.framework.feign;

import com.framework.entity.Student;
import com.framework.feign.iml.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

// 声明式接口只需要添加注解,不需要写实现类
// 实现容错机制捕获,然后通过FeignError类去实现容断处理
@FeignClient(value = "eureka-provider", fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
