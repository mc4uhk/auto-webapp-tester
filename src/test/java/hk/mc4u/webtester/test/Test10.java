package hk.mc4u.webtester.test;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test10 {

	public void test01() throws Exception {
		Queue<String> msgQ = new LinkedList<>();
		String msg = "msg A";
		msgQ.add(msg);
		log.info("added {}",msg);
		msg = "msg B";
		msgQ.add(msg);
		log.info("added {}",msg);

		msg = "msg C";
		msgQ.add(msg);
		log.info("added {}",msg);

		String removed = msgQ.remove();
		log.info("removed {}",removed);
		
		removed = msgQ.remove();
		log.info("removed {}",removed);

		if(!msgQ.isEmpty()) {
			removed = msgQ.remove();
			log.info("removed {}",removed);
		}

	}

	@Test
	public void test02() throws Exception {
		Queue<String> msgQ = new LinkedList<>();
		String msg = "msg A";
		msgQ.add(msg);
		log.info("added {}",msg);
		msg = "msg B";
		msgQ.add(msg);
		log.info("added {}",msg);

		msg = "msg C";
		msgQ.add(msg);
		log.info("added {}",msg);

		String removed = msgQ.poll();
		log.info("msgs {}",removed);

		removed = msgQ.poll();
		log.info("msgs {}",removed);
		removed = msgQ.poll();
		log.info("msgs {}",removed);
		removed = msgQ.poll();
		log.info("msgs {}",removed);
		removed = msgQ.poll();
		log.info("msgs {}",removed);


	}
}
