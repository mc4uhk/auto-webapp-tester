package hk.mc4u.webtester.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hk.mc4u.webtester.task.MultiWindowTask;
import hk.mc4u.webtester.task.MultiWindowTest02;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {

	@Autowired
	MultiWindowTask task;

	@GetMapping("hello")
	public ResponseEntity<?> sayHello() {
		log.info("Hello");
		try {
			task.test01();
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}
		return ResponseEntity.ok("ok");
	}

}
