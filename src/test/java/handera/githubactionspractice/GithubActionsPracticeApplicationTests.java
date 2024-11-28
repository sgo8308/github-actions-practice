package handera.githubactionspractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class GithubActionsPracticeApplicationTests {

	@Test
	void successtest() {
		System.out.println("hi");
	}

  @Test
  void failtest() {
    System.out.println("hi");
    throw new RuntimeException("fail");
  }
}
