package com.example.project;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.when;

// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.project.Repository.projectRepository;
// import com.example.project.model.User;
import com.example.project.service.projectService;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
    projectService demoser;

	@MockBean
    projectRepository repo;

	// @Test
	// void contextLoads() {
	// 	when(repo.findAll()).thenReturn(Stream.of(new User(1,"sam","SAM@1")).collect(Collectors.toList()));
	// 	assertEquals(1, demoser.getting().size());
	// }

}
