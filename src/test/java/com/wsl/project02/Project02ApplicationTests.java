package com.wsl.project02;

import com.wsl.project02.bean.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Project02ApplicationTests {

    @Autowired
    private Teacher teacher;


    @Test
    public void contextLoads() {
        System.out.println("Project02ApplicationTests.contextLoads");
        System.out.println(teacher);

    }


}
