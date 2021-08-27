package hk.mc4u.webtester.service;
import static hk.mc4u.webtester.Constant.*;

import org.springframework.stereotype.Service;

import hk.mc4u.webtester.model.HelloForm;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HelloService {
	
	public String save(HelloForm form) {
		String result="";
		String status = form.getStatus();
		switch(status) {
			case A:
				result = saveA(form);
				break;
			case D:
				result = saveD(form);
				break;
			case O:
				result = saveO(form);
				break;
			case I:
				result = saveI(form);
				break;
			default:
				result = "default value";
		}
		
		log.info("saved: {}", result);
		return result;
	}

	public String saveA(HelloForm form) {
		saveBasic(form); 
		return A;
	}

	public String saveD(HelloForm form) {
		saveBasic(form); 
		return D;
	}

	public String saveO(HelloForm form) {
		saveBasic(form); 
		return O;
	}

	public String saveI(HelloForm form) {
		saveBasic(form); 
		return I;
	}
	
	public String saveBasic(HelloForm form) {
		return "";
	}

}
