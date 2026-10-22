package com.jm.springmvcdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tools.jackson.databind.MappingIterator;
import tools.jackson.databind.ObjectMapper;

@SpringBootTest
class SpringmvcDemoApplicationTests {

    @Test
    void contextLoads() {
        ObjectMapper objectMapper = new ObjectMapper();
        // 对象转 JSON
        Person person = new Person();
        person.setName("上官婉儿");
        person.setAge(20);
        person.setGender(0);
        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);
        // JSON 转对象
        String jsonStr = "{\"age\":20,\"gender\":0,\"name\":\"上官婉儿\"}";
        Person person1 = objectMapper.readValue(jsonStr, Person.class);
        System.out.println(person1.toString());
    }

}
