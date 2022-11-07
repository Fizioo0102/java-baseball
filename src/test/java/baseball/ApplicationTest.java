package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 게임종료_후_재시작() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "1", "597", "589", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Test
    void 게임성공시_종료() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("123", "456", "789", "278", "589", "287","2");
                    assertThat(output()).contains("1볼", "낫싱", "2볼", "2볼 1스트라이크", "3스트라이크","게임 종료");
                },
                2,8,7
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
