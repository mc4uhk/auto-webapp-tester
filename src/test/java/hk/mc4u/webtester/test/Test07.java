package hk.mc4u.webtester.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test07 {

	@Test
	public void test01() throws Exception {
	    // 使用 mock 静态方法创建 Mock 对象.
	    List mockedList = Mockito.mock(List.class);
	    assertThat(mockedList instanceof List)
	    	.isTrue();

	    // mock 方法不仅可以 Mock 接口类, 还可以 Mock 具体的类型.
	    ArrayList mockedArrayList = Mockito.mock(ArrayList.class);
	    assertThat(mockedArrayList instanceof List)
	    	.isTrue();
	    assertThat(mockedArrayList instanceof ArrayList)
			.isTrue();
	}

}
