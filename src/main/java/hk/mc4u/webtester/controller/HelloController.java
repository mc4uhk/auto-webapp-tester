package hk.mc4u.webtester.controller;

import static hk.mc4u.webtester.Constant.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hk.mc4u.webtester.model.HelloForm;
import hk.mc4u.webtester.service.HelloService;
import hk.mc4u.webtester.task.MultiWindowTask;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {

	@Autowired
	MultiWindowTask task;
	
	@Autowired
	HelloService service;

	HelloForm form = new HelloForm();
	
	@GetMapping("hello")
	public ResponseEntity<?> sayHello() {
		log.info("Hello");
		try {
			task.run();
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}
		return ResponseEntity.ok("ok");
	}

	@GetMapping("save")
	public ResponseEntity<?> save() {
		log.info("Start Save");
		form.setStatus(O);
		String result = service.save(form);
		log.info("End Save: {}",result);
		return ResponseEntity.ok("saved");
	}
}
